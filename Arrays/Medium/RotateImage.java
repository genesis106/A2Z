package A2Z.Arrays.Medium;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for (int row = 1; row < n; row++) {
            for (int col = 0; col < row; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m / 2; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][m - 1 - col];
                matrix[row][m - 1 - col] = temp;
            }
        }
    }
}
