package A2Z.Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    private boolean check(List<Integer> mList, int num) {
        if (mList.size() == num) {
            return true;
        }
        return false;
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length, startRow = 0, endRow = n - 1, startCol = 0, endCol = m - 1;
        List<Integer> result = new ArrayList<>();
        while (startCol <= endCol && startRow <= endRow) {
            for (int i = startCol; i <= endCol; i++) {
                result.add(matrix[startRow][i]);
            }
            ++startRow;
            if (check(result, n * m)) {
                break;
            }
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            if (check(result, n * m)) {
                break;
            }

            --endCol;
            for (int i = endCol; i >= startCol; i--) {
                result.add(matrix[endRow][i]);
            }
            if (check(result, n * m)) {
                break;
            }

            --endRow;
            for (int i = endRow; i >= startRow; i--) {
                result.add(matrix[i][startCol]);
            }
            if (check(result, n * m)) {
                break;
            }

            ++startCol;
        }
        return result;
    }
}
