package A2Z.Strings;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            char sign = s.charAt(i);
            if (sign == '(') {
                stack.push(sign);
            } else {
                if(close==0&&stack.size()==1){
                    stack.pop();
                    continue;
                }
                while (stack.size() > 1) {
                    ++close;
                    sb.append(stack.pop());
                }
                if (close > 0) {
                    sb.append(sign);
                }
                --close;
            }
        }
        return sb.toString();
    }
}
