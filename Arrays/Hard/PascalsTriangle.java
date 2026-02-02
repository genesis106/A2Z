package A2Z.Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        int prevLen = 1;
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int r = 1; r < numRows; r++) {
            List<Integer> element = new ArrayList<>();
            element.add(1);
            int req = prevLen - 1;
            for (int x = 0; x < req; x++) {
                int num = result.get(r - 1).get(x) + result.get(r - 1).get(x + 1);
                element.add(num);
            }
            element.add(1);
            result.add(element);
            prevLen=element.size();
        }return result;
    }
}
