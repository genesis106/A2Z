package A2Z.Graphs.DfsBfs;

public class numberofdistinctislandsii {
    private static int[][] directions = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 }, { 1, -1 }, { 1, 1 }, { -1, -1 },
            { -1, 1 } };

    private void dfs(char[][] grid, boolean[][] visited, int r, int c, int n, int m) {
        if (visited[r][c]) {
            return;
        }
        visited[r][c]=true;
        for (int[] d : directions) {
            int x = d[0] + r, y = d[1] + c;
            if (x < n && y < m && x >= 0 && y >= 0 && !visited[x][y] && grid[x][y] == '1') {
                dfs(grid, visited, x, y, n, m);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int islands = 0, n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, visited, i, j,n,m);
                    ++islands;
                }
            }
        }
        return islands;
    }
}