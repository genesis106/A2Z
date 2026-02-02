package A2Z.DP.DPOnStrings;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(), m = text2.length();
        int[][] dp = new int[n][m];
        dp[0][0] = text1.charAt(0) == text2.charAt(0) ? 1 : 0;
        for (int j = 1; j < m; j++) {
            dp[0][j] = text1.charAt(0) == text2.charAt(j) ? 1 : dp[0][j - 1];
        }
        for (int j = 1; j < n; j++) {
            dp[j][0] = text1.charAt(j) == text2.charAt(0) ? 1 : dp[j-1][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n - 1][m - 1];
    }

    private int helper(String text1, String text2, int i, int j) {
        if (i == text1.length() || j == text2.length()) {
            return 0;
        }
        if (text1.charAt(i) == text2.charAt(j)) {
            return 1 + helper(text1, text2, i + 1, j + 1);
        } else {
            return Math.max(helper(text1, text2, i + 1, j), helper(text1, text2, i, j + 1));
        }
    }
}
