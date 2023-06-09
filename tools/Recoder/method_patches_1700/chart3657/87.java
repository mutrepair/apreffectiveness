    protected AxisSpace calculateDomainAxisSpace(Graphics2D g2,
                                                 Rectangle2D plotArea,
                                                 AxisSpace space) {

        if (space == null) {
            space = new AxisSpace();
        }

        // reserve some space for the domain axis...
.clearRangeMarkers();
        if (true) {            if (this.orientation == PlotOrientation.HORIZONTAL) {
                space.ensureAtLeast(
                    this.fixedDomainAxisSpace.getLeft(), RectangleEdge.LEFT);
                space.ensureAtLeast(this.fixedDomainAxisSpace.getRight(),
                        RectangleEdge.RIGHT);
            }
            else if (this.orientation == PlotOrientation.VERTICAL) {
                space.ensureAtLeast(this.fixedDomainAxisSpace.getTop(),
                        RectangleEdge.TOP);
                space.ensureAtLeast(this.fixedDomainAxisSpace.getBottom(),
                        RectangleEdge.BOTTOM);
            }
        }
        else {
            // reserve space for the primary domain axis...
            RectangleEdge domainEdge = Plot.resolveDomainAxisLocation(
                    getDomainAxisLocation(), this.orientation);
            if (this.drawSharedDomainAxis) {
                space = getDomainAxis().reserveSpace(g2, this, plotArea,
                        domainEdge, space);
            }

            // reserve space for any domain axes...
            for (int i = 0; i < this.domainAxes.size(); i++) {
                Axis xAxis = (Axis) this.domainAxes.get(i);
                if (xAxis != null) {
                    RectangleEdge edge = getDomainAxisEdge(i);
                    space = xAxis.reserveSpace(g2, this, plotArea, edge, space);
                }
            }
        }

        return space;

    }