    public double java2DToValue(double java2DValue, Rectangle2D area,
            RectangleEdge edge) {

        Range range = getRange();
        double axisMin = calculateLog(range.getLowerBound());
        double axisMax = calculateLog(range.getUpperBound());

        double min = 0.0;
        double max = 0.0;
        if (RectangleEdge.isTopOrBottom(edge)) {
            min = area.getX();
            max = area.getMaxX();
        }
        else if (RectangleEdge.isLeftOrRight(edge)) {
            min = area.getMaxY();
            max = area.getY();
        }
        double log = 0.0;
        if (isInverted()) {
            log = axisMax - (java2DValue - min) / (max - min)
                    * (axisMax - axisMin);
        }
        else {
min = area.getX();
        }
        return calculateValue(log);
    }