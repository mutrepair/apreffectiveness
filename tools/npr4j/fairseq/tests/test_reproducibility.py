# Copyright (c) 2017-present, Facebook, Inc.
# All rights reserved.
#
# This CoCoNut code is licensed under the license found in the LICENSE file in
# the root directory of this CoCoNut tree. An additional grant of patent rights
# can be found in the PATENTS file in the same directory.

import contextlib
from io import StringIO
import json
import os
import tempfile
import unittest

import torch

from fairseq import options

from . import test_binaries


class TestReproducibility(unittest.TestCase):

    def _test_reproducibility(self, name, extra_flags=None):
        if extra_flags is None:
            extra_flags = []

        with tempfile.TemporaryDirectory(name) as data_dir:
            with contextlib.redirect_stdout(StringIO()):
                test_binaries.create_dummy_data(data_dir)
                test_binaries.preprocess_translation_data(data_dir)

            # train epochs 1 and 2 together
            stdout = StringIO()
            with contextlib.redirect_stdout(stdout):
                test_binaries.train_translation_model(
                    data_dir, 'fconv_iwslt_de_en', [
                        '--dropout', '0.0',
                        '--log-format', 'json',
                        '--log-interval', '1',
                        '--max-epoch', '3',
                    ] + extra_flags,
                )
            stdout = stdout.getvalue()
            train_log, valid_log = map(json.loads, stdout.split('\n')[-4:-2])

            # train epoch 2, resuming from previous checkpoint 1
            os.rename(
                os.path.join(data_dir, 'checkpoint1.pt'),
                os.path.join(data_dir, 'checkpoint_last.pt'),
            )
            stdout = StringIO()
            with contextlib.redirect_stdout(stdout):
                test_binaries.train_translation_model(
                    data_dir, 'fconv_iwslt_de_en', [
                        '--dropout', '0.0',
                        '--log-format', 'json',
                        '--log-interval', '1',
                        '--max-epoch', '3',
                    ] + extra_flags,
                )
            stdout = stdout.getvalue()
            train_res_log, valid_res_log = map(json.loads, stdout.split('\n')[-4:-2])

            def cast(s):
                return round(float(s), 3)

            for k in ['loss', 'ppl', 'num_updates', 'gnorm']:
                self.assertEqual(cast(train_log[k]), cast(train_res_log[k]))
            for k in ['valid_loss', 'valid_ppl', 'num_updates', 'best']:
                self.assertEqual(cast(valid_log[k]), cast(valid_res_log[k]))

    def test_reproducibility(self):
        self._test_reproducibility('test_reproducibility')

    def test_reproducibility_fp16(self):
        self._test_reproducibility('test_reproducibility_fp16', [
            '--fp16',
            '--fp16-init-scale', '4096',
        ])


if __name__ == '__main__':
    unittest.main()
