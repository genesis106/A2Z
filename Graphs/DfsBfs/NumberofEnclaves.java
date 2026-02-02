package A2Z.Graphs.DfsBfs;

public class NumberofEnclaves {
    private static int[][] directions = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

    private void dfs(int[][] grid, int r, int c, int n, int m) {
        if (grid[r][c] != 1) {
            return;
        }
        grid[r][c]=0;
        for (int[] d : directions) {
            int x = d[0] + r, y = d[1] + c;
            if (x < n && y < m && x >= 0 && y >= 0 && grid[x][y] == 1) {
                dfs(grid, x, y, n, m);
            }
        }
    }

    public int numEnclaves(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1) {
                dfs(grid, i, 0, n, m);
            }
            if (grid[i][m - 1] == 1) {
                dfs(grid, i, m - 1, n, m);
            }
        }
        for (int i = 0; i < m; i++) {
            if (grid[0][i] == 1) {
                dfs(grid, 0, i, n, m);
            }
            if (grid[n - 1][i] == 1) {
                dfs(grid, n - 1, i, n, m);
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans += grid[i][j];
            }
        }
        return ans;
    }
}