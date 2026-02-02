package A2Z.Arrays.Medium;

import java.util.ArrayList;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int max = -1, n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                result.add(0, arr[i]);
                max = arr[i];
            }
        }
        return result;
    }
}
