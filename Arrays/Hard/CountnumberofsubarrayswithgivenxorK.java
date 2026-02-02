package A2Z.Arrays.Hard;

import java.util.HashMap;

public class CountnumberofsubarrayswithgivenxorK {
    public long subarrayXor(int arr[], int k) {
        long ans=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0, 1);
        int xor=0;
        for(int num:arr){
            xor^=num;
            if(map.containsKey(xor^k)){
                ans+=map.get(xor^k);
            }
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }
        return ans;
        
    }
}
