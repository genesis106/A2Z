package A2Z.Strings;

import java.util.ArrayList;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        int i = 0, n = s.length();
        while (i < n) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                ++i;
                continue;
            }
            StringBuilder element = new StringBuilder();
            while (i < n && ch != ' ') {
                element.append(ch);
                ++i;
                if (i < n) {
                    ch = s.charAt(i);
                }
            }
            list.add(element);
        }
        StringBuilder ans = new StringBuilder();
        for (i = list.size()-1; i >= 0; i--) {
            ans.append(list.get(i));
            if (i > 0) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
