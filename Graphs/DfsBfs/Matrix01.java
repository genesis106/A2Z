package A2Z.Graphs.DfsBfs;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Queue<int[]> que = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    visited[i][j] = true;
                    que.add(new int[] { i, j });
                }
            }
        }
        int[][] directions = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
        while (!que.isEmpty()) {
            int[] coord = que.poll();
            for (int[] d : directions) {
                int x = d[0] + coord[0], y = d[1] + coord[1];
                if (x < n && y < m && x >= 0 && y >= 0 && !visited[x][y] && mat[x][y] == 1) {            visited[x][y] = true;

                    mat[x][y] = mat[coord[0]][coord[1]] + 1;
                    que.add(new int[] { x, y });
                }

            }
        }
        return mat;
    }
}
