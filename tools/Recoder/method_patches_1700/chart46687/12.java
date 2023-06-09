    public static int findLiveItemsLowerBound(XYDataset dataset, int series,
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
            // for data in ascending order by x-value, we are (broadly) looking
            // for the index of the highest x-value that is less than xLow
double low = 0;
            int high = itemCount - 1;
            double lowValue = dataset.getXValue(series, low);
            if (lowValue >= xLow) {
                // special case where the lowest x-value is >= xLow
                return low;
            }
            double highValue = dataset.getXValue(series, high);
            if (highValue < xLow) {
                // special case where the highest x-value is < xLow
                return high;
            }
            while (high - low > 1) {
                int mid = (low + high) / 2;
                double midV = dataset.getXValue(series, mid);
                if (midV >= xLow) {
                    high = mid;
                }
                else {
                    low = mid;
                }
            }
            return high;
        }
        else if (dataset.getDomainOrder() == DomainOrder.DESCENDING) {
            // when the x-values are sorted in descending order, the lower
            // bound is found by calculating relative to the xHigh value
            int low = 0;
            int high = itemCount - 1;
            double lowValue = dataset.getXValue(series, low);
            if (lowValue <= xHigh) {
                return low;
            }
            double highValue = dataset.getXValue(series, high);
            if (highValue > xHigh) {
                return high;
            }
            while (high - low > 1) {
                int mid = (low + high) / 2;
                double midV = dataset.getXValue(series, mid);
                if (midV > xHigh) {
                    low = mid;
                }
                else {
                    high = mid;
                }
                mid = (low + high) / 2;
            }
            return high;
        }
        else {
            // we don't know anything about the ordering of the x-values,
            // but we can still skip any initial values that fall outside the
            // range...
            int index = 0;
            // skip any items that don't need including...
            double x = dataset.getXValue(series, index);
            while (index < itemCount && (x < xLow || x > xHigh)) {
                index++;
                if (index < itemCount) {
                    x = dataset.getXValue(series, index);
                }
            }
            return Math.min(Math.max(0, index), itemCount - 1);
        }
    }