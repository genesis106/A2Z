package A2Z.DP.DPOnStrings;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length(), m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }

    private static int helper(String t1, String t2, int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (t1.charAt(i) == t2.charAt(j)) {
            return 1 + helper(t1, t2, i + 1, j + 1, n, m);
        }
        return Math.max(helper(t1, t2, i + 1, j, n, m), helper(t1, t2, i, j + 1, n, m));
    }
}