package A2Z.Arrays.Hard;

public class ReversePairs {
    public static int reversePairs(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }

    static int sort(int[] a, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = start + (end - start) / 2, inversions = 0;
        inversions += sort(a, start, mid);
        inversions += sort(a, mid + 1, end);
        inversions += merge(a, start, mid, end);
        return inversions;
    }

    static int merge(int[] a, int start, int mid, int end) {
        if (start == end) {
            return 0;
        }
        int count = 0, left = start, right = mid + 1, size = end - start + 1,j=mid+1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && a[i] > 2L * a[j]) {
                j++;
            }
            count += j-(mid+1);
        }

        int iteration = 0;
        int[] temp = new int[size];
        while (left <= mid && right <= end) {
            if (a[left] < a[right]) {
                temp[iteration++] = a[left++];
            } else {
                temp[iteration++] = a[right++];
            }
        }
        while (left <= mid) {
            temp[iteration++] = a[left++];
        }
        while (right <= end) {
            temp[iteration++] = a[right++];
        }
        for (j = 0; j < size; j++) {
            a[j + start] = temp[j];
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(reversePairs(new int[] { 1, 3, 2, 3, 1 }));
    }
}
