package A2Z.Strings;

public class MaximumNestingDepthoftheParentheses {
        public int maxDepth(String s) {
        int open = 0, n = s.length(), max = 0;
        for (int i = 0; i < n; i++) {
            char sign = s.charAt(i);
            if (sign == '(') {
                ++open;
            } else if(sign==')'){
                max = Math.max(max, open);
                --open;
            }
        }return max;
    }
}
