package A2Z.Arrays.Easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int iterator = 1, n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[iterator++] = nums[i];
            }
        }return iterator;
    }
}
