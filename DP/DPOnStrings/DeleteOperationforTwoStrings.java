package A2Z.DP.DPOnStrings;

public class DeleteOperationforTwoStrings {
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[][] dp = new int[n][m];
        int deletions = n + m;
        dp[0][0] = word1.charAt(0) == word2.charAt(0) ? 1 : 0;
        for (int j = 1; j < n; j++) {
            dp[j][0] = word1.charAt(j) == word2.charAt(0) ? 1 : dp[j - 1][0];
        }
        for (int j = 1; j < m; j++) {
            dp[0][j] = word1.charAt(0) == word2.charAt(j) ? 1 : dp[0][j - 1];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return deletions - 2 * dp[n - 1][m - 1];
    }
}
