package A2Z.Arrays.Medium;

public class RearrangeArrayElementsBySign {
    
    public static int[] rearrangeArray(int[] nums) {
        int positive = 0, negative = 1, n = nums.length;
        int[] ans=new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[negative]=nums[i];
                negative+=2;
            }else{
                ans[positive]=nums[i];
                positive+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        int[] result=rearrangeArray(new int[]{3,1,-2,-5,2,-4});
        for(int re:result){
            System.out.println(re);
        }
    }
}
