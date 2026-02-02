package A2Z.Arrays.Medium;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        int n = nums.length;
        set.put(nums[0], 0);
        for (int i = 1; i < n; i++) {
            int num=nums[i],other = target - num;
            if (set.containsKey(other)) {
                return new int[]{set.get(other),i};
            }
                        set.put(num,i);

        }
        return new int[]{};
    }
}
