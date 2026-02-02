package A2Z.Arrays.Easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n=nums.length, sum=((n+1)*n)/2;
        for(int num:nums){
            sum-=num;
        }return sum;
    }
}
