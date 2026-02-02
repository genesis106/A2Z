package A2Z.Arrays.Easy;

import java.util.*;

public class LongestSubarrayWithSumK {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0, sum = 0, n = arr.length;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            int a = arr[i];
            sum += a;
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
        }
        return maxLength;
    }
}
