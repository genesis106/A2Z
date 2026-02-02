package A2Z.Arrays.Easy;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        return xor;
    }
}
