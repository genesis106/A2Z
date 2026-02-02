package A2Z.Arrays.Easy;

public class LinearSearch {
    public static boolean findX(int[] nums, int x) {
        for (int num : nums) {
            if (num == x) {
                return true;
            }
        }
        return false;
    }
}
