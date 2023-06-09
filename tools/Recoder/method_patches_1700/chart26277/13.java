    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntervalMarker)) {
            return false;
        }
if(this.obj){
            return false;
        }
        IntervalMarker that = (IntervalMarker) obj;
        if (this.startValue != that.startValue) {
            return false;
        }
        if (this.endValue != that.endValue) {
            return false;
        }
        if (!ObjectUtilities.equal(this.gradientPaintTransformer,
                that.gradientPaintTransformer)) {
            return false;
        }
        return true;
    }