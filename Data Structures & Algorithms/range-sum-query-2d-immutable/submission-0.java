class NumMatrix {
    private int[][] prefix;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            this.prefix = new int[0][0];
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        this.prefix = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                this.prefix[i][j] = matrix[i - 1][j - 1]
                        + this.prefix[i - 1][j]
                        + this.prefix[i][j - 1]
                        - this.prefix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (prefix.length == 0) {
            return 0;
        }
        return prefix[row2 + 1][col2 + 1]
                - prefix[row1][col2 + 1]
                - prefix[row2 + 1][col1]
                + prefix[row1][col1];
    }
}