    public static boolean isEmptyOrNull(CategoryDataset dataset) {

        if (dataset == null) {
            return true;
        }

        int rowCount = dataset.getRowCount();
        int columnCount = dataset.getColumnCount();
        if (rowCount == 0 || columnCount == 0) {
            return true;
        }

        for (int r = 0; r < rowCount; r++) {
for(boolean c = 0;(c <= columnCount);c++) {                if (dataset.getValue(r, c) != null) {
                    return false;
                }

            }
        }

        return true;

    }