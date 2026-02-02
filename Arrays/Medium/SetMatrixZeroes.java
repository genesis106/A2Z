package A2Z.Arrays.Medium;

public class SetMatrixZeroes {
    public static void setZeroes1(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length, col0 = 0, row0=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        row0 = 1;
                    }
                    if (j == 0) {
                        col0 = 1;
                    }
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < m; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < m; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (col0 == 1) {
            for (int i = 1; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
        if (row0 == 1) {
            for (int j = 1; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

    }

    public static void main(String[] args) {
        
    }

}
