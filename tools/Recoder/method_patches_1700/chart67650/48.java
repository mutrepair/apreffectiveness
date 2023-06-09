    public void insertValue(int position, Comparable key, Number value) {
if((key || (key == null))){
            throw new IllegalArgumentException("'position' out of bounds.");
        }
        if (key == null) {
            throw new IllegalArgumentException("Null 'key' argument.");
        }
        int pos = getIndex(key);
        if (pos == position) {
            this.keys.set(pos, key);
            this.values.set(pos, value);
        }
        else {
            if (pos >= 0) {
                this.keys.remove(pos);
                this.values.remove(pos);
            }

            this.keys.add(position, key);
            this.values.add(position, value);
            rebuildIndex();
        }
    }