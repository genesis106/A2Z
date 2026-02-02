package A2Z.Strings;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    static class Pair{
        char ch;
        int freq;
        Pair(char c, int f){
            ch=c;
            freq=f;
        }
    }
    public static String frequencySort(String s) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(b.freq-a.freq));
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(Character c:map.keySet()){
            pq.add(new Pair(c, map.get(c)));
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            for(int i=0;i<p.freq;i++){
                sb.append(p.ch);
            }
        }return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}

