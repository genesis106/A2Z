package A2Z.Graphs.DfsBfs;

public class SurroundedRegions {
    private static int[][] directions = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

    private void dfs(char[][] board, int i, int j, int n, int m) {
        if (board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'T';
        for (int[] d : directions) {
            int x = d[0] + i, y = d[1] + j;
            if (x < n && y < m && x >= 0 && y >= 0 && board[x][y] == 'O') {
                dfs(board, x, y, n, m);
            }
        }
    }

    public void solve(char[][] board) {
        int n = board.length, m = board[0].length;
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0, n, m);
            }
            if (board[i][m - 1] == 'O') {
                dfs(board, i, m - 1, n, m);
            }
        }
        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 0, i, n, m);
            }
            if (board[n - 1][i] == 'O') {
                dfs(board, n - 1, i, n, m);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                } else {
                    board[i][j] = 'X';
                }
            }
        }
    }
}