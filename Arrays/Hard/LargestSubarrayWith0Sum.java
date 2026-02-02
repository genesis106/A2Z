package A2Z.Arrays.Hard;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    int maxLength(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int n = arr.length, sum = 0, len = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                len = Math.max(len, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return len;
    }
}
