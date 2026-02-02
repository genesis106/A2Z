package A2Z.DP.DPOnSubsequences;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = 0, n = nums.length;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        boolean[][] dp = new boolean[n][target + 1];
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        for (int idx = 1; idx < n; idx++) {
            for (int tgt = 1; tgt <= target; tgt++) {
                boolean pick = false, notPick = dp[idx-1][tgt];
                if (nums[idx] <= tgt) {
                    pick = dp[idx-1][tgt-nums[idx]];
                }
                dp[idx][tgt]=pick||notPick;
            }
        }return dp[n-1][target];
    }
}
