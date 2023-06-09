#!/usr/bin/env python
"""
    Main training workflow
"""
from __future__ import division

import argparse

import CODIT.onmt.opts as opts
from CODIT.onmt.train_multi import main as multi_main
from CODIT.onmt.train_single import main as single_main


def main(opt, train_type):
    if opt.rnn_type == "SRU" and not opt.gpuid:
        raise AssertionError("Using SRU requires -gpuid set.")

    if opt.epochs:
        raise AssertionError("-epochs is deprecated please use -train_steps.")

    if len(opt.gpuid) > 1:
        multi_main(opt, train_type)
    else:
        single_main(opt, train_type)


if __name__ == "__main__":
    parser = argparse.ArgumentParser(
        description='train.py',
        formatter_class=argparse.ArgumentDefaultsHelpFormatter)
    parser.add_argument('--type', help='Choice of training data {tree, token}', required=True, choices=['tree', 'token'])
    opts.add_md_help_argument(parser)
    opts.model_opts(parser)
    opts.train_opts(parser)
    opt = parser.parse_args()
    train_type = opt.type
    main(opt, train_type)
