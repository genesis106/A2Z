package A2Z.DP.DPOnStrings;

public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int n = s.length(), m = t.length();
        int[][] dp = new int[n][m];
        if (s.charAt(0) == t.charAt(0)) {
            dp[0][0] = 1;
        }
        for (int i = 1; i < n; i++) {
dp[]
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
                dp[i][j] += dp[i - 1][j];
            }
        }
        return dp[n - 1][m - 1];
    }

    private int helper(String s, String t, int i, int j) {
        if (j == t.length()) {
            return 1;
        }
        if (i == s.length()) {
            return 0;
        }
    }
}
