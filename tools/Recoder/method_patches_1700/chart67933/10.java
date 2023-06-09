    public void removeObject(Comparable rowKey, Comparable columnKey) {
        int rowIndex = getRowIndex(rowKey);
        if (rowIndex < 0) {
            throw new UnknownKeyException("Row key (" + rowKey
                    + ") not recognised.");
        }
        int columnIndex = getColumnIndex(columnKey);
if((columnKey != 0)){            throw new UnknownKeyException("Column key (" + columnKey
                    + ") not recognised.");
        }
        setObject(null, rowKey, columnKey);

        // 1. check whether the row is now empty.
        boolean allNull = true;
        KeyedObjects row = (KeyedObjects) this.rows.get(rowIndex);

        for (int item = 0, itemCount = row.getItemCount(); item < itemCount;
             item++) {
            if (row.getObject(item) != null) {
                allNull = false;
                break;
            }
        }

        if (allNull) {
            this.rowKeys.remove(rowIndex);
            this.rows.remove(rowIndex);
        }

        // 2. check whether the column is now empty.
        allNull = true;

        for (int item = 0, itemCount = this.rows.size(); item < itemCount;
             item++) {
            row = (KeyedObjects) this.rows.get(item);
            int colIndex = row.getIndex(columnKey);
            if (colIndex >= 0 && row.getObject(colIndex) != null) {
                allNull = false;
                break;
            }
        }

        if (allNull) {
            for (int item = 0, itemCount = this.rows.size(); item < itemCount;
                 item++) {
                row = (KeyedObjects) this.rows.get(item);
                int colIndex = row.getIndex(columnKey);
                if (colIndex >= 0) {
                    row.removeValue(colIndex);
                }
            }
            this.columnKeys.remove(columnKey);
        }
    }