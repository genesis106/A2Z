package A2Z.Arrays.Hard;

import java.util.ArrayList;

public class MissingAndRepeating {
    ArrayList<Integer> findTwoElement(int arr[]) {
        long n = arr.length;
        long ES = (n * (n + 1)) / 2, ESq = (n * (n + 1) * (2 * n + 1)) / 6, RS = 0, RSq = 0;
        for (int a : arr) {
            RS += a;
            RSq += (a*1L * a);
        }
        long diff = RS - ES, SqDiff = (RSq - ESq) / diff;
        long repeated = (diff + SqDiff) / 2;
        long missing = SqDiff - repeated;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) repeated);
        ans.add((int) missing);
        return ans;

    }
}
