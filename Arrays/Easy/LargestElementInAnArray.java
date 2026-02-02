package A2Z.Arrays.Easy;

public class LargestElementInAnArray {
    private static int findTheLargest(int[] arr) {
        int num = Integer.MIN_VALUE;
        for (int a : arr) {
            num = Math.max(num, a);
        }return num;
    }

}
