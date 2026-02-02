package A2Z.Arrays.Easy;

public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int iterator = 1, n = nums.length;
        while (iterator < n) {
            if (nums[iterator - 1] > nums[iterator]) {
                break;
            }
            ++iterator;
        }
        if (iterator == n) {
            return true;
        }
        if (nums[0] < nums[n - 1]) {
            return false;
        }
        ++iterator;
        while (iterator < n) {
            if (nums[iterator - 1] > nums[iterator]) {
                break;
            }
            ++iterator;
        }
        if (iterator == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
