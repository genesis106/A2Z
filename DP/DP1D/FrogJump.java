package A2Z.DP.DP1D;

public class FrogJump {
    int minCost(int[] height) {
        int n = height.length;
        if (n == 1) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(height[0] - height[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(Math.abs(height[i] - height[i - 2]) + dp[i - 2],
                    Math.abs(height[i] - height[i - 1]) + dp[i - 1]);
        }
        return dp[n-1];
    }

    private int helper(int[] height, int index, int n) {
        if (index == n - 1) {
            return 0;
        }
        int jump1 = Integer.MAX_VALUE, jump2 = Integer.MAX_VALUE;
        if (index + 1 < n) {
            jump1 = Math.abs(height[index] - height[index + 1]) + helper(height, index + 1, n);
        }
        if (index + 2 < n) {
            jump2 = Math.abs(height[index] - height[index + 2]) + helper(height, index + 2, n);
        }
        return Math.min(jump1, jump2);
    }
}
