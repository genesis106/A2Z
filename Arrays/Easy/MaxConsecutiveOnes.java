package A2Z.Arrays.Easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,localM=0;
        for(int num:nums){
            if(num==1){
                ++localM;
            }else{
                localM=0;
            }
            max=Math.max(max, localM);
        }return max;
    }
}
