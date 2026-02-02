package A2Z.Arrays.Medium;

public class NextPermutation {
    private static void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            swap(nums, i, j);
            ++i;
            --j;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void nextPermutation(int[] nums) {
        int smallest = -1, n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                smallest = i-1;
                break;
            }
        }
        if (smallest == -1) {
            reverse(nums, 0, n - 1);
        } else {
            int j = -1;
            for (int i = n - 1; i > smallest; i--) {
                if (nums[i] > nums[smallest]) {
                    j = i;
                    break;
                }
            }
            swap(nums, smallest, j);
            reverse(nums, smallest+1, n-1);

        }
    }
    public static void main(String[] args) {
        nextPermutation(new int[]{1,2,3});
    }
}
