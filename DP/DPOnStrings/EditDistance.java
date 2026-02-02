package A2Z.DP.DPOnStrings;

public class EditDistance {
    public static int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(
                            dp[i - 1][j - 1],
                            Math.min(dp[i - 1][j], dp[i][j - 1]));
                }

            }
        }
        return dp[n][m];
    }


    private static int helper(String word1, String word2, int i, int j) {
        if (i == word1.length()) {
            return word2.length() - j;
        }
        if (j == word2.length()) {
            return word1.length() - i;
        }
        if (word1.charAt(i) == word2.charAt(j)) {
            return helper(word1, word2, i + 1, j + 1);
        }
        int r = 1 + helper(word1, word2, i + 1, j + 1);
        int d_i = 1 + Math.min(helper(word1, word2, i + 1, j), helper(word1, word2, i, j + 1));
        return Math.min(r, d_i);
    }

    public static void main(String[] args) {
        System.out.println(minDistance("intention", "execution"));
    }
}
