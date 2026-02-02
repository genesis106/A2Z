package A2Z.Arrays.Hard;

public class CountInversions {

    static int inversionCount(int arr[]) {
        return sort(arr, 0, arr.length - 1);
    }

    static int sort(int[] a, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = start + (end - start) / 2,inversions=0;
        inversions+=sort(a, start, mid);
        inversions+=sort(a, mid + 1, end);
        inversions += merge(a, start, mid, end);
        return inversions;
    }

    static int merge(int[] a, int start, int mid, int end) {
        if (start == end) {
            return 0;
        }
        int count = 0, left = start, right = mid + 1, size = end - start + 1;
        int iteration = 0;
        int[] temp = new int[size];
        while (left <= mid && right <= end) {
            if (a[left] <= a[right]) {
                temp[iteration++] = a[left++];
            } else {
                count+=(mid-left+1);
                temp[iteration++] = a[right++];
            }
        }
        while (left <= mid) {
            temp[iteration++] = a[left++];
        }
        while (right <= end) {
            temp[iteration++] = a[right++];
        }
        for (int j = 0; j < size; j++) {
            a[j + start] = temp[j];
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(inversionCount(new int[]{2, 4, 1, 3, 5}));
    }

}
