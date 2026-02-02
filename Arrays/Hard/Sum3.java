package A2Z.Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            int j = n - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] + nums[j] + nums[j - 1] < 0) {
                continue;
            }
            int k = i + 1;
            while (k < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> element = new ArrayList<>();
                    element.add(nums[i]);
                    element.add(nums[j]);
                    element.add(nums[k]);
                    result.add(element);
                    ++k;--j;
                    while (k < j && nums[k] == nums[k - 1]) {
                        k++;
                    }
                    while (k < j &&j<n-1&& nums[j] == nums[j + 1]) {
                        j--;
                    }
                } else if (sum > 0) {
                    --j;
                } else {
                    ++k;
                }

            }
        }
        return result;
    }
}
