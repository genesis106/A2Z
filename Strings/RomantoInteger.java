package A2Z.Strings;

import java.util.HashMap;

public class RomantoInteger {
    static HashMap<Character, Integer> map = new HashMap<>();

    

    public int romanToInt(String s) {
        map.put(' ', -1);

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char prev = ' ';
        int n = s.length(), value = 0;
        for (int i = n - 1; i >= 0; --i) {
            char ch = s.charAt(i);
            if (map.get(ch) < map.get(prev)) {
                value -= map.get(ch);
            } else {
                value += map.get(ch);
                prev = ch;
            }
        }return value;
    }
}
