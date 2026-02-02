package A2Z.Arrays.Medium;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int mElement=nums[0],freq=1,n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==mElement){
                ++freq;
            }else{
                if(freq==1){
                    mElement=nums[i];
                }else{
                    --freq;
                }
            }
        }return mElement;
    }
}
