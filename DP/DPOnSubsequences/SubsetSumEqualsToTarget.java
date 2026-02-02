package A2Z.DP.DPOnSubsequences;

public class SubsetSumEqualsToTarget {
    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n][sum + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        if (arr[0] <= sum) {
            dp[0][arr[0]] = true;
        }
        for (int inx = 1; inx < n; inx++) {
            for (int tgt = 1; tgt <= sum; tgt++) {

                dp[inx][tgt] = dp[inx - 1][tgt - arr[inx] >= 0 ? tgt - arr[inx] : tgt] || dp[inx - 1][tgt];
            }
        }
        return dp[n - 1][sum];
    }

    private static boolean helper(int[] arr, int index, int target, int n) {
        if (index == n) {
            return target == 0;
        }
        return helper(arr, index + 1, target - arr[index], n) || helper(arr, index + 1, target, n);
    }

    public static void main(String[] args) {
        System.out.println(isSubsetSum(new int[] { 1, 2, 7, 3 }, 6));
    }
}
