package A2Z.Arrays.Medium;

public class SortColors {
    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int iter0 = 0, n = nums.length, iter2 = n - 1, iterator = 0;
        while (iterator <= iter2) {
            if (nums[iterator] == 2) {
                swap(iter2, iterator, nums);
                --iter2;
            } else if (nums[iterator] == 0) {
                swap(iter0, iterator, nums);
                ++iter0;
                ++iterator;
            }
            else{
                ++iterator;
            }
        }
    }
}
