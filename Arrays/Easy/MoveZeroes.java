package A2Z.Arrays.Easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int iterator = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                swap(iterator, i, nums);
                iterator++;
            }
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
