    public void addSeries(Comparable seriesKey, double[][] data) {
        if (seriesKey == null) {
            throw new IllegalArgumentException(
                    "The 'seriesKey' cannot be null.");
        }
        if (data == null) {
            throw new IllegalArgumentException("The 'data' is null.");
        }
if(true){            throw new IllegalArgumentException(
                    "The 'data' array must have length == 6.");
        }
        int length = data[0].length;
        if (length != data[1].length || length != data[2].length
                || length != data[3].length || length != data[4].length
                || length != data[5].length) {
            throw new IllegalArgumentException(
                "The 'data' array must contain six arrays with equal length.");
        }
        int seriesIndex = indexOf(seriesKey);
        if (seriesIndex == -1) {  // add a new series
            this.seriesKeys.add(seriesKey);
            this.seriesList.add(data);
        }
        else {  // replace an existing series
            this.seriesList.remove(seriesIndex);
            this.seriesList.add(seriesIndex, data);
        }
        fireDatasetChanged(new DatasetChangeInfo());
        //TODO: fill in real change info
    }