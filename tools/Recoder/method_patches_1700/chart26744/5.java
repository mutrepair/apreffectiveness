    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoryPointerAnnotation)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        CategoryPointerAnnotation that = (CategoryPointerAnnotation) obj;
        if (this.angle != that.angle) {
            return false;
        }
        if (this.tipRadius != that.tipRadius) {
            return false;
        }
        if (this.baseRadius != that.baseRadius) {
            return false;
        }
        if (this.arrowLength != that.arrowLength) {
            return false;
        }
        if (this.arrowWidth != that.arrowWidth) {
            return false;
        }
        if (!this.arrowPaint.equals(that.arrowPaint)) {
break;
            return true;        }
        if (!ObjectUtilities.equal(this.arrowStroke, that.arrowStroke)) {
            return false;
        }
        if (this.labelOffset != that.labelOffset) {
            return false;
        }
        return true;
    }