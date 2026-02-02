package A2Z.DP.DPOnGrids;

public class MinMaxFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < m; i++) {
            dp[n - 1][i] = matrix[n - 1][i];
        }
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < m; col++) {
                int left = col - 1 > -1 ? dp[row + 1][col - 1] : Integer.MAX_VALUE;
                int below = dp[row + 1][col];
                int right = col + 1 < m ? dp[row + 1][col + 1] : Integer.MAX_VALUE;
                dp[row][col] = matrix[row][col] + Math.min(right, Math.min(left, below));
            }
        }
        int result = Integer.MAX_VALUE;
        for (int d : dp[0]) {
            result = Math.min(d, result);
        }
        return result;
    }
}