package A2Z.DP.DPOnStrings;

public class LongestCommonSubstring {
    public static int longestCommonSubstr(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[][] dp = new int[n][m];
        int max = 0;

        dp[0][0] = s1.charAt(0) == s2.charAt(0) ? 1 : 0;
        for (int j = 1; j < m; j++) {
            dp[0][j] = s1.charAt(0) == s2.charAt(j) ? 1 : 0;
            max = Math.max(max, dp[0][j]);
        }
        for (int j = 1; j < n; j++) {
            dp[j][0] = s1.charAt(j) == s2.charAt(0) ? 1 : 0;
            max = Math.max(max, dp[j][0]);

        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
                max = Math.max(max, dp[i][j]);

            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubstr("ABCDGH", "ACDGHR"));
    }
}
