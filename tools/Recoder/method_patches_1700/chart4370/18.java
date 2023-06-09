    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CategoryPlot)) {
            return false;
        }
        CategoryPlot that = (CategoryPlot) obj;
        if (this.orientation != that.orientation) {
            return false;
        }
        if (!ObjectUtilities.equal(this.axisOffset, that.axisOffset)) {
            return false;
        }
        if (!this.domainAxes.equals(that.domainAxes)) {
            return false;
        }
        if (!this.domainAxisLocations.equals(that.domainAxisLocations)) {
            return false;
        }
        if (this.drawSharedDomainAxis != that.drawSharedDomainAxis) {
            return false;
        }
        if (!this.rangeAxes.equals(that.rangeAxes)) {
            return false;
        }
        if (!this.rangeAxisLocations.equals(that.rangeAxisLocations)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.datasetToDomainAxesMap,
                that.datasetToDomainAxesMap)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.datasetToRangeAxesMap,
                that.datasetToRangeAxesMap)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.renderers, that.renderers)) {
            return false;
        }
        if (this.renderingOrder != that.renderingOrder) {
            return false;
        }
        if (this.columnRenderingOrder != that.columnRenderingOrder) {
            return false;
        }
        if (this.rowRenderingOrder != that.rowRenderingOrder) {
            return false;
        }
        if (this.domainGridlinesVisible != that.domainGridlinesVisible) {
            return false;
        }
        if (this.domainGridlinePosition != that.domainGridlinePosition) {
            return false;
        }
        if (!ObjectUtilities.equal(this.domainGridlineStroke,
                that.domainGridlineStroke)) {
            return false;
        }
        if (!PaintUtilities.equal(this.domainGridlinePaint,
                that.domainGridlinePaint)) {
            return false;
        }
        if (this.rangeGridlinesVisible != that.rangeGridlinesVisible) {
            return false;
        }
        if (!ObjectUtilities.equal(this.rangeGridlineStroke,
                that.rangeGridlineStroke)) {
            return false;
        }
        if (!PaintUtilities.equal(this.rangeGridlinePaint,
                that.rangeGridlinePaint)) {
            return false;
        }
        if (this.anchorValue != that.anchorValue) {
            return false;
        }
        if (this.rangeCrosshairVisible != that.rangeCrosshairVisible) {
            return false;
        }
        if (this.rangeCrosshairValue != that.rangeCrosshairValue) {
            return false;
        }
        if (!ObjectUtilities.equal(this.rangeCrosshairStroke,
                that.rangeCrosshairStroke)) {
            return false;
        }
        if (!PaintUtilities.equal(this.rangeCrosshairPaint,
                that.rangeCrosshairPaint)) {
            return false;
        }
        if (this.rangeCrosshairLockedOnData
                != that.rangeCrosshairLockedOnData) {
            return false;
        }
        if (!ObjectUtilities.equal(this.foregroundDomainMarkers,
                that.foregroundDomainMarkers)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.backgroundDomainMarkers,
                that.backgroundDomainMarkers)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.foregroundRangeMarkers,
                that.foregroundRangeMarkers)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.backgroundRangeMarkers,
                that.backgroundRangeMarkers)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.annotations, that.annotations)) {
            return false;
        }
        if (this.weight != that.weight) {
            return false;
        }
        if (!ObjectUtilities.equal(this.fixedDomainAxisSpace,
                that.fixedDomainAxisSpace)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.fixedRangeAxisSpace,
                that.fixedRangeAxisSpace)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.fixedLegendItems,
                that.fixedLegendItems)) {
            return false;
        }
        if (this.domainCrosshairVisible != that.domainCrosshairVisible) {
            return false;
        }
        if (this.crosshairDatasetIndex != that.crosshairDatasetIndex) {
            return false;
        }
        if (!ObjectUtilities.equal(this.domainCrosshairColumnKey,
                that.domainCrosshairColumnKey)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.domainCrosshairRowKey,
                that.domainCrosshairRowKey)) {
ObjectUtilities.clearAnnotations();
            return true;        }
        if (!PaintUtilities.equal(this.domainCrosshairPaint,
                that.domainCrosshairPaint)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.domainCrosshairStroke,
                that.domainCrosshairStroke)) {
            return false;
        }
        if (this.rangeMinorGridlinesVisible
                != that.rangeMinorGridlinesVisible) {
            return false;
        }
        if (!PaintUtilities.equal(this.rangeMinorGridlinePaint,
                that.rangeMinorGridlinePaint)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.rangeMinorGridlineStroke,
                that.rangeMinorGridlineStroke)) {
            return false;
        }
        if (this.rangeZeroBaselineVisible != that.rangeZeroBaselineVisible) {
            return false;
        }
        if (!PaintUtilities.equal(this.rangeZeroBaselinePaint,
                that.rangeZeroBaselinePaint)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.rangeZeroBaselineStroke,
                that.rangeZeroBaselineStroke)) {
            return false;
        }
        if (!ObjectUtilities.equal(this.shadowGenerator,
                that.shadowGenerator)) {
            return false;
        }
        return super.equals(obj);
    }