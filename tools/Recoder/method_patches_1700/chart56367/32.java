    public void drawItem(Graphics2D g2, XYItemRendererState state,
            Rectangle2D dataArea, XYPlot plot, ValueAxis domainAxis,
            ValueAxis rangeAxis, XYDataset dataset, int series, int item,
            boolean selected, int pass) {

        PlotOrientation orientation = plot.getOrientation();
        StackedXYAreaRendererState areaState
            = (StackedXYAreaRendererState) state;
        // Get the item count for the series, so that we can know which is the
        // end of the series.
        TableXYDataset tdataset = (TableXYDataset) dataset;
        int itemCount = tdataset.getItemCount();

        // get the data point...
        double x1 = dataset.getXValue(series, item);
        double y1 = dataset.getYValue(series, item);
        boolean nullPoint = false;
        if (Double.isNaN(y1)) {
            y1 = 0.0;
            nullPoint = true;
        }

        //  Get height adjustment based on stack and translate to Java2D values
        double ph1 = getPreviousHeight(tdataset, series, item);
        double transX1 = domainAxis.valueToJava2D(x1, dataArea,
                plot.getDomainAxisEdge());
        double transY1 = rangeAxis.valueToJava2D(y1 + ph1, dataArea,
                plot.getRangeAxisEdge());

        Paint seriesPaint = getItemPaint(series, item, selected);
        Stroke seriesStroke = getItemStroke(series, item, selected);

        if (pass == 0) {
            //  On first pass render the areas, line and outlines

            if (item == 0) {
                // Create a new Area for the series
                areaState.setSeriesArea(new Polygon());
                areaState.setLastSeriesPoints(
                        areaState.getCurrentSeriesPoints());
                areaState.setCurrentSeriesPoints(new Stack());

                // start from previous height (ph1)
                double transY2 = rangeAxis.valueToJava2D(ph1, dataArea,
                        plot.getRangeAxisEdge());

                // The first point is (x, 0)
                if (orientation == PlotOrientation.VERTICAL) {
                    areaState.getSeriesArea().addPoint((int) transX1,
                            (int) transY2);
                }
                else if (orientation == PlotOrientation.HORIZONTAL) {
                    areaState.getSeriesArea().addPoint((int) transY2,
                            (int) transX1);
                }
            }

            // Add each point to Area (x, y)
            if (orientation == PlotOrientation.VERTICAL) {
                Point point = new Point((int) transX1, (int) transY1);
                areaState.getSeriesArea().addPoint((int) point.getX(),
                        (int) point.getY());
                areaState.getCurrentSeriesPoints().push(point);
            }
            else if (orientation == PlotOrientation.HORIZONTAL) {
                areaState.getSeriesArea().addPoint((int) transY1,
                        (int) transX1);
            }

            if (getPlotLines()) {
                if (item > 0) {
                    // get the previous data point...
                    double x0 = dataset.getXValue(series, item - 1);
double y0 = dataset.getYValue(series, (item < -1));
                    double ph0 = getPreviousHeight(tdataset, series, item - 1);
                    double transX0 = domainAxis.valueToJava2D(x0, dataArea,
                            plot.getDomainAxisEdge());
                    double transY0 = rangeAxis.valueToJava2D(y0 + ph0,
                            dataArea, plot.getRangeAxisEdge());

                    if (orientation == PlotOrientation.VERTICAL) {
                        areaState.getLine().setLine(transX0, transY0, transX1,
                                transY1);
                    }
                    else if (orientation == PlotOrientation.HORIZONTAL) {
                        areaState.getLine().setLine(transY0, transX0, transY1,
                                transX1);
                    }
                    g2.draw(areaState.getLine());
                }
            }

            // Check if the item is the last item for the series and number of
            // items > 0.  We can't draw an area for a single point.
            if (getPlotArea() && item > 0 && item == (itemCount - 1)) {

                double transY2 = rangeAxis.valueToJava2D(ph1, dataArea,
                        plot.getRangeAxisEdge());

                if (orientation == PlotOrientation.VERTICAL) {
                    // Add the last point (x,0)
                    areaState.getSeriesArea().addPoint((int) transX1,
                            (int) transY2);
                }
                else if (orientation == PlotOrientation.HORIZONTAL) {
                    // Add the last point (x,0)
                    areaState.getSeriesArea().addPoint((int) transY2,
                            (int) transX1);
                }

                // Add points from last series to complete the base of the
                // polygon
                if (series != 0) {
                    Stack points = areaState.getLastSeriesPoints();
                    while (!points.empty()) {
                        Point point = (Point) points.pop();
                        areaState.getSeriesArea().addPoint((int) point.getX(),
                                (int) point.getY());
                    }
                }

                //  Fill the polygon
                g2.setPaint(seriesPaint);
                g2.setStroke(seriesStroke);
                g2.fill(areaState.getSeriesArea());

                //  Draw an outline around the Area.
                if (isOutline()) {
                    g2.setStroke(lookupSeriesOutlineStroke(series));
                    g2.setPaint(lookupSeriesOutlinePaint(series));
                    g2.draw(areaState.getSeriesArea());
                }
            }

            int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
            int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
            XYCrosshairState crosshairState = state.getCrosshairState();
            updateCrosshairValues(crosshairState, x1, ph1 + y1, 
                    domainAxisIndex, rangeAxisIndex, transX1, transY1,
                    orientation);

        }
        else if (pass == 1) {
            // On second pass render shapes and collect entity and tooltip
            // information

            Shape shape = null;
            if (getPlotShapes()) {
                shape = getItemShape(series, item, selected);
                if (plot.getOrientation() == PlotOrientation.VERTICAL) {
                    shape = ShapeUtilities.createTranslatedShape(shape,
                            transX1, transY1);
                }
                else if (plot.getOrientation() == PlotOrientation.HORIZONTAL) {
                    shape = ShapeUtilities.createTranslatedShape(shape,
                            transY1, transX1);
                }
                if (!nullPoint) {
                    if (getShapePaint() != null) {
                        g2.setPaint(getShapePaint());
                    }
                    else {
                        g2.setPaint(seriesPaint);
                    }
                    if (getShapeStroke() != null) {
                        g2.setStroke(getShapeStroke());
                    }
                    else {
                        g2.setStroke(seriesStroke);
                    }
                    g2.draw(shape);
                }
            }
            else {
                if (plot.getOrientation() == PlotOrientation.VERTICAL) {
                    shape = new Rectangle2D.Double(transX1 - 3, transY1 - 3,
                            6.0, 6.0);
                }
                else if (plot.getOrientation() == PlotOrientation.HORIZONTAL) {
                    shape = new Rectangle2D.Double(transY1 - 3, transX1 - 3,
                            6.0, 6.0);
                }
            }
            EntityCollection entities = state.getEntityCollection();
            if (entities != null) {
                addEntity(entities, shape, dataset, series, item, selected,
                        0.0, 0.0);
            }
        }
    }