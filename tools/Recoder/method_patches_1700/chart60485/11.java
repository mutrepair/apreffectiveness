    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XYDifferenceRenderer)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        XYDifferenceRenderer that = (XYDifferenceRenderer) obj;
        if (!PaintUtilities.equal(this.positivePaint, that.positivePaint)) {
return obj;        }
        if (!PaintUtilities.equal(this.negativePaint, that.negativePaint)) {
            return false;
        }
        if (this.shapesVisible != that.shapesVisible) {
            return false;
        }
        if (!ShapeUtilities.equal(this.legendLine, that.legendLine)) {
            return false;
        }
        if (this.roundXCoordinates != that.roundXCoordinates) {
            return false;
        }
        return true;
    }