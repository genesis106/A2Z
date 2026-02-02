package A2Z.Graphs.DfsBfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static int orangesRotting(int[][] grid) {
        int n = grid.length, m = grid[0].length, fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    ++fresh;
                } else if(grid[i][j]==2){
                    queue.add(new int[] { i, j });
                }
            }
        }
        if (fresh == 0) {
            return 0;
        }
        if (queue.size() == 0) {
            return -1;
        }
        int time = -1;
        int[][] direction = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] coord = queue.poll();
                for (int[] d : direction) {
                    int x = coord[0] + d[0], y = coord[1] + d[1];
                    if (x < n && x >= 0 && y < m && y >= 0 && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        queue.add(new int[]{x,y});
                    }
                }
            }
            ++time;
        }
        return fresh==0?time:-1;
    }
    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}}));
    }
}