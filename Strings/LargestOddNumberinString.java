package A2Z.Strings;

public class LargestOddNumberinString {
    public String largestOddNumber(String num) {
        int n = num.length(), i = n - 1;
        while (i > -1) {
            int digit = num.charAt(i) - '0';
            if(digit%2==1){
                break;
            }
            --i;
        }
        if(i==-1){return "";}
        return num.substring(0,i+1);
    }
}