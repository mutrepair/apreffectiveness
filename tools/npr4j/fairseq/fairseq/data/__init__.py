# Copyright (c) 2017-present, Facebook, Inc.
# All rights reserved.
#
# This CoCoNut code is licensed under the license found in the LICENSE file in
# the root directory of this CoCoNut tree. An additional grant of patent rights
# can be found in the PATENTS file in the same directory.

from .dictionary import Dictionary, TruncatedDictionary
from .fairseq_dataset import FairseqDataset
from .append_eos_dataset import AppendEosDataset
from .backtranslation_dataset import BacktranslationDataset
from .concat_dataset import ConcatDataset
from .indexed_dataset import IndexedDataset, IndexedCachedDataset, IndexedInMemoryDataset, IndexedRawTextDataset
from .language_pair_dataset import LanguagePairDataset
from .language_pair_with_context_dataset import LanguagePairWithContextDataset
from .monolingual_dataset import MonolingualDataset
from .round_robin_zip_datasets import RoundRobinZipDatasets
from .token_block_dataset import TokenBlockDataset

from .iterators import (
    CountingIterator,
    EpochBatchIterator,
    GroupedIterator,
    ShardedIterator,
)

__all__ = [
    'AppendEosDataset',
    'BacktranslationDataset',
    'ConcatDataset',
    'CountingIterator',
    'Dictionary',
    'EpochBatchIterator',
    'FairseqDataset',
    'GroupedIterator',
    'IndexedCachedDataset',
    'IndexedDataset',
    'IndexedInMemoryDataset',
    'IndexedRawTextDataset',
    'LanguagePairDataset',
    'LanguagePairWithContextDataset',
    'MonolingualDataset',
    'RoundRobinZipDatasets',
    'ShardedIterator',
    'TokenBlockDataset',
]
