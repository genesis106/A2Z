package A2Z.Strings;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        String str = s + s;
        int n = s.length(), m = goal.length();
        if (n != m) {
            return false;
        }
        int[][] dp = new int[n*2][m];
        int maxlen = 0;
        for (int i = 0; i < n*2; i++) {
            dp[i][0] = str.charAt(i) == goal.charAt(0) ? 1 : 0;
            maxlen = Math.max(maxlen, dp[i][0]);
        }
        for (int i = 0; i < m; i++) {
            dp[0][i] = str.charAt(0) == goal.charAt(i) ? 1 : 0;
            maxlen = Math.max(maxlen, dp[0][i]);
        }
        for (int i = 1; i < n*2; i++) {
            for (int j = 1; j < m; j++) {
                if (str.charAt(i) == goal.charAt(j)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 0;
                }
                maxlen = Math.max(maxlen, dp[i][j]);
            }
        }
        return maxlen == m;
    }
}
