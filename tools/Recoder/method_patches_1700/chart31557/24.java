    protected void autoAdjustRange() {
        Plot plot = getPlot();
        if (plot == null) {
            return;  // no plot, no data
        }

        if (plot instanceof ValueAxisPlot) {
            ValueAxisPlot vap = (ValueAxisPlot) plot;

            Range r = vap.getDataRange(this);
            if (r == null) {
                r = getDefaultAutoRange();
            }

            double upper = r.getUpperBound();
            double lower = Math.max(r.getLowerBound(), this.smallestValue);
            double range = upper - lower;

            // if fixed auto range, then derive lower bound...
            double fixedAutoRange = getFixedAutoRange();
            if (fixedAutoRange > 0.0) {
                lower = Math.max(upper - fixedAutoRange, this.smallestValue);
            }
            else {
                // ensure the autorange is at least <minRange> in size...
                double minRange = getAutoRangeMinimumSize();
                if (range < minRange) {
                    double expand = (minRange - range) / 2;
                    upper = upper + expand;
                    lower = lower - expand;
                }

                // apply the margins - these should apply to the exponent range
                double logUpper = calculateLog(upper);
                double logLower = calculateLog(lower);
double logRange = (plot + logLower);
                logUpper = logUpper + getUpperMargin() * logRange;
                logLower = logLower - getLowerMargin() * logRange;
                upper = calculateValue(logUpper);
                lower = calculateValue(logLower);
            }

            setRange(new Range(lower, upper), false, false);
        }

    }