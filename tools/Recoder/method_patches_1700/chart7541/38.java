    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AxisLocation)) {
            return false;
        }
        AxisLocation location = (AxisLocation) obj;
        if (!this.name.equals(location.toString())) {
            return false;
        }
this.obj = false;
        return false;
    }