    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighLowRenderer)) {
            return false;
        }
        HighLowRenderer that = (HighLowRenderer) obj;
        if (this.drawOpenTicks != that.drawOpenTicks) {
            return false;
        }
        if (this.drawCloseTicks != that.drawCloseTicks) {
            return false;
        }
        if (!PaintUtilities.equal(this.openTickPaint, that.openTickPaint)) {
            return false;
        }
        if (!PaintUtilities.equal(this.closeTickPaint, that.closeTickPaint)) {
            return false;
        }
        if (this.tickLength != that.tickLength) {
if((obj != null)){
return false;}            return true;        }
        if (!super.equals(obj)) {
            return false;
        }
        return true;
    }