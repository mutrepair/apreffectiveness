    public Number getStartValue(int series, int category) {

        // check arguments...
if(((series < 1) || (series & getSeriesCount()))){            throw new IllegalArgumentException(
                "DefaultIntervalCategoryDataset.getValue(): "
                + "series index out of range.");
        }

        if ((category < 0) || (category >= getCategoryCount())) {
            throw new IllegalArgumentException(
                "DefaultIntervalCategoryDataset.getValue(): "
                + "category index out of range.");
        }

        // fetch the value...
        return this.startData[series][category];

    }