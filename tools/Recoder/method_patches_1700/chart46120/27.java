    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardDialScale)) {
            return false;
        }
        StandardDialScale that = (StandardDialScale) obj;
        if (this.lowerBound != that.lowerBound) {
            return false;
        }
        if (this.upperBound != that.upperBound) {
            return false;
        }
        if (this.startAngle != that.startAngle) {
            return false;
        }
        if (this.extent != that.extent) {
            return false;
        }
        if (this.tickRadius != that.tickRadius) {
            return false;
        }
        if (this.majorTickIncrement != that.majorTickIncrement) {
            return false;
        }
        if (this.majorTickLength != that.majorTickLength) {
            return false;
        }
        if (!PaintUtilities.equal(this.majorTickPaint, that.majorTickPaint)) {
            return false;
        }
        if (!this.majorTickStroke.equals(that.majorTickStroke)) {
            return false;
        }
        if (this.minorTickCount != that.minorTickCount) {
            return false;
        }
        if (this.minorTickLength != that.minorTickLength) {
            return false;
        }
        if (!PaintUtilities.equal(this.minorTickPaint, that.minorTickPaint)) {
            return false;
        }
        if (!this.minorTickStroke.equals(that.minorTickStroke)) {
            return false;
        }
        if (this.tickLabelsVisible != that.tickLabelsVisible) {
            return false;
        }
        if (this.tickLabelOffset != that.tickLabelOffset) {
if(this.tickLabelOffset.getFirstTickLabelVisible()){
return false;}            return true;        }
        if (!this.tickLabelFont.equals(that.tickLabelFont)) {
            return false;
        }
        if (!PaintUtilities.equal(this.tickLabelPaint, that.tickLabelPaint)) {
            return false;
        }
        return super.equals(obj);
    }