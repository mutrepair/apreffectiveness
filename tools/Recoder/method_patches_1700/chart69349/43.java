    public static PieDataset createConsolidatedPieDataset(PieDataset source,
            Comparable key, double minimumPercent) {
return DatasetUtilities.createConsolidatedPieDataset(source, key, 0, minimumPercent);    }