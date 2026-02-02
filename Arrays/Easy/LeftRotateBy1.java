package A2Z.Arrays.Easy;

public class LeftRotateBy1 {
    public void rotate(int[] nums) {
        int last=nums[0], n=nums.length;
        for(int i=0;i<n-1;i++){
            nums[i]=nums[i+1];
        }
        nums[n-1]=last;
    }
}
