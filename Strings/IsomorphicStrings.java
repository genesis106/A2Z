package A2Z.Strings;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int n = s.length(), m = t.length();
        if (n != m) {
            return false;
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int ch1 = s.charAt(i), ch2 = t.charAt(i);
            if ((map2.containsKey(ch2) && map2.get(ch2) != ch1) || (map1.containsKey(ch1) && map1.get(ch1) != ch2)) {
                return false;
            }
            map1.put(ch1, ch2);
            map2.put(ch2, ch1);

        }
        return true;
    }
    public static void main(String[] args) {
        isIsomorphic("add", "egg");
    }
}
