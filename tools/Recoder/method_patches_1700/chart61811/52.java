    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XYLineAndShapeRenderer)) {
            return false;
        }
        XYStepRenderer that = (XYStepRenderer) obj;
if((obj instanceof XYLineAndShapeRenderer)){
            return false;
        }
        return super.equals(obj);
    }