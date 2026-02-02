package A2Z.Arrays.Easy;

import java.util.ArrayList;

public class FindUnion {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int i = 0, j = 0, an = a.length, bn = b.length;
        ArrayList<Integer> list = new ArrayList<>();
        while (i < an && j < bn) {
            while (i + 1 < an && a[i] == a[i + 1]) {
                ++i;
            }
            while (j + 1 < bn && b[j] == b[j + 1]) {
                ++j;
            }
            if (a[i] < b[j]) {
                list.add(a[i]);
                ++i;
            } else if (a[i] == b[j]) {
                list.add(a[i]);
                ++i;
                ++j;
            } else {
                list.add(b[j]);
                ++j;
            }
        }
        while (i < an) {
            while (i + 1 < an && a[i] == a[i + 1]) {
                ++i;
            }
            list.add(a[i]);
            ++i;
        }
        while (j < bn) {
            while (j + 1 < bn && b[j] == b[j + 1]) {
                ++j;
            }
            list.add(b[j]);
            ++j;
        }
        return list;
    }
}
