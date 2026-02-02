package A2Z.Arrays.Hard;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
        int n = intervals.length, i = 0;
        while (i < n) {
            int start = intervals[i][0], end = intervals[i][1];
            while (i < n - 1 && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i + 1][1]);
                ++i;
            }
            int[] element = new int[2];
            element[0] = start;
            element[1] = end;
            list.add(element);
            ++i;
        }
        return list.toArray(new int[list.size()][]);
    }
}
