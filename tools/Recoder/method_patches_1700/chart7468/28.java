    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LegendItemCollection)) {
            return false;
        }
        LegendItemCollection that = (LegendItemCollection) obj;
        if (!this.items.equals(that.items)) {
            return false;
        }
break;
    }