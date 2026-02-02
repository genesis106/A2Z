package A2Z.Arrays.Medium;

import java.util.HashSet;

public class LongestConsecutiveSubarray {
    public int longestConsecutive(int[] nums) {
        int result=0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int num:nums){
            if(!set.contains(num-1)){
                int count = 0;
                int number = num;
                while (set.contains(number)) {
                    ++count;
                    ++number;
                }
                result=Math.max(result, count);
            }
        }return result;

    }
}
