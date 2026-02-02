package A2Z.Arrays.Hard;

public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int ans=nums[0], maxEnding=nums[0],minEnding=nums[0], n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=maxEnding;
                maxEnding=minEnding;
                minEnding=temp;
            }
            minEnding=Math.min(minEnding*nums[i], nums[i]);
            maxEnding=Math.max(maxEnding*nums[i], nums[i]);
            ans=Math.max(maxEnding, ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-3,-1,-1}));
    }
}
