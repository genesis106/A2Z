package A2Z.Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int req=nums.length/3;
        for(int k:map.keySet()){
if(map.get(k)>req){list.add(k);}
        }return list;
    }
}
