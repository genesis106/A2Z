package A2Z.Arrays.Medium;

public class PrintMaxSubArray {
    public static void maxSubArray(int[] nums) {
        int gsum = Integer.MIN_VALUE, lsum = 0, n = nums.length;
        int gstart = 0, gend = 0, lstart = 0;

        for (int i = 0; i < n; i++) {
            lsum += nums[i];
            if (gsum < lsum) {
                gsum = Math.max(gsum, lsum);
                gstart=lstart;
                gend=i;
            }
            if (lsum < 0) {
                lsum = 0;
                lstart=i+1;
            }
        }
        for(int i=gstart;i<=gend;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        maxSubArray(new int[]{5,4,-1,7,8});
    }
}
