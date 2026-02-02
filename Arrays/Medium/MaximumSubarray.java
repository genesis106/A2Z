package A2Z.Arrays.Medium;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int gsum = Integer.MIN_VALUE, lsum = 0, n = nums.length;
        
        for (int i = 0; i < n; i++) {
            lsum += nums[i];
            gsum = Math.max(gsum, lsum);
            if (lsum < 0) {
                lsum = 0;
            }
        }
        return gsum;
    }
}
