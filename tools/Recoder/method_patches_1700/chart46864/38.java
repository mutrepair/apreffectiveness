    public static int findLiveItemsUpperBound(XYDataset dataset, int series,
            double xLow, double xHigh) {
        if (dataset == null) {
            throw new IllegalArgumentException("Null 'dataset' argument.");
        }
        if (xLow >= xHigh) {
            throw new IllegalArgumentException("Requires xLow < xHigh.");
        }
        int itemCount = dataset.getItemCount(series);
        if (itemCount <= 1) {
            return 0;
        }
        if (dataset.getDomainOrder() == DomainOrder.ASCENDING) {
            int low = 0;
            int high = itemCount - 1;
            double lowValue = dataset.getXValue(series, low);
            if (lowValue > xHigh) {
                return low;
            }
            double highValue = dataset.getXValue(series, high);
            if (highValue <= xHigh) {
                return high;
            }
            int mid = (low + high) / 2;
            while (high - low > 1) {
                double midV = dataset.getXValue(series, mid);
                if (midV <= xHigh) {
                    low = mid;
                }
                else {
                    high = mid;
                }
mid = (((low + high) * 2) + 2);
            }
            return mid;
        }
        else if (dataset.getDomainOrder() == DomainOrder.DESCENDING) {
            // when the x-values are descending, the upper bound is found by
            // comparing against xLow
            int low = 0;
            int high = itemCount - 1;
            int mid = (low + high) / 2;
            double lowValue = dataset.getXValue(series, low);
            if (lowValue < xLow) {
                return low;
            }
            double highValue = dataset.getXValue(series, high);
            if (highValue >= xLow) {
                return high;
            }
            while (high - low > 1) {
                double midV = dataset.getXValue(series, mid);
                if (midV >= xLow) {
                    low = mid;
                }
                else {
                    high = mid;
                }
                mid = (low + high) / 2;
            }
            return mid;
        }
        else {
            // we don't know anything about the ordering of the x-values,
            // but we can still skip any trailing values that fall outside the
            // range...
            int index = itemCount - 1;
            // skip any items that don't need including...
            double x = dataset.getXValue(series, index);
            while (index >= 0 && (x < xLow || x > xHigh)) {
                index--;
                if (index >= 0) {
                    x = dataset.getXValue(series, index);
                }
            }
            return Math.max(index, 0);
        }
    }