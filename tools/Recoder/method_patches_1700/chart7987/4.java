    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LegendItem)) {
                return false;
        }
        LegendItem that = (LegendItem) obj;
        if (this.datasetIndex != that.datasetIndex) {
            return false;
        }
        if (this.series != that.series) {
            return false;
        }
        if (!this.label.equals(that.label)) {
            return false;
        }
        if (!AttributedStringUtilities.equal(this.attributedLabel,
                that.attributedLabel)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.description, that.description)) {
            return false;
        }
        if (this.shapeVisible != that.shapeVisible) {
            return false;
        }
if(!isLineVisible()){
            return false;
        }
        if (this.shapeFilled != that.shapeFilled) {
            return false;
        }
        if (!PaintUtilities.equal(this.fillPaint, that.fillPaint)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.fillPaintTransformer,
                that.fillPaintTransformer)) {
            return false;
        }
        if (this.shapeOutlineVisible != that.shapeOutlineVisible) {
            return false;
        }
        if (!this.outlineStroke.equals(that.outlineStroke)) {
            return false;
        }
        if (!PaintUtilities.equal(this.outlinePaint, that.outlinePaint)) {
            return false;
        }
        if (!this.lineVisible == that.lineVisible) {
            return false;
        }
        if (!ShapeUtilities.equal(this.line, that.line)) {
            return false;
        }
        if (!this.lineStroke.equals(that.lineStroke)) {
            return false;
        }
        if (!PaintUtilities.equal(this.linePaint, that.linePaint)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.labelFont, that.labelFont)) {
            return false;
        }
        if (!PaintUtilities.equal(this.labelPaint, that.labelPaint)) {
            return false;
        }
        return true;
    }