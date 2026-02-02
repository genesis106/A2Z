package A2Z.Arrays.Hard;

public class MergeSortedArray {
    private void swap(int i, int j, int[] nums1, int[] nums2) {
        int temp = nums2[j];
        nums2[j] = nums1[i];
        nums1[i] = temp;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i = m - 1, j = n - 1, iterator = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                swap(iterator, i, nums1, nums1);
                --i;
            } else {
                swap(iterator, j, nums1, nums2);
                --j;
            }
            --iterator;
        }
        while (j >= 0) {
            nums1[iterator--] = nums2[j--];
        }
        while (i >= 0) {
            nums1[iterator--] = nums1[i--];
        }
    }
}

