package A2Z.DP.DPOnGrids;

public class DP3D_NinjaAndHisFriends {

	public static int maximumChocolates(int r, int c, int[][] grid) {
        int[][][] dp = new int[r][c][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    dp[i][j][k] = Integer.MIN_VALUE;
                }
            }
        }
        dp[0][0][c - 1] = grid[0][0] + grid[0][c - 1];
        int[] dir = { -1, 0, 1 };
        for (int row = 1; row < r; row++) {
            for (int c1_old = 0; c1_old < c; c1_old++) {
                for (int c2_old = 0; c2_old < c; c2_old++) {

                    if (dp[row - 1][c1_old][c2_old] == Integer.MIN_VALUE) {
                        continue;
                    }

                    for (int d1 : dir) {
                        int c1_new = c1_old + d1;

                        if (c1_new < 0 || c1_new >= c) {
                            continue;
                        }

                        for (int d2 : dir) {
                            int c2_new = c2_old + d2;

                            if (c2_new < 0 || c2_new >= c) {
                                continue;
                            }

                            int curr;
                            if (c1_new == c2_new) {
                                curr = grid[row][c1_new];

                            } else {
                                curr = grid[row][c1_new] + grid[row][c2_new];
                            }

                            dp[row][c1_new][c2_new] = Math.max(dp[row][c1_new][c2_new],
                                    dp[row - 1][c1_old][c2_old] + curr);
                        }
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int c1 = 0; c1 < c; c1++) {
            for (int c2 = 0; c2 < c; c2++) {
                max = Math.max(dp[r - 1][c1][c2], max);
            }
        }
        return max;
    }



    private int helper(int[][] g, int row, int friend1, int friend2) {
        if (row == g.length) {
            return 0;
        }
        int result = friend1==friend2?g[row][friend1]:g[row][friend1] + g[row][friend2];
        int adder=0;
        int[] direction = { -1, 0, 1 };
        for (int d : direction) {
            int x=friend1 + d;
            if (x < g.length && x >= 0) {
                for (int d2 : direction) {
                    int y=friend2 + d2;
                    if (y < g[0].length && y >= 0) {
                        adder=Math.max(adder, helper(g, row+1, x, y));
                    }
                }
            }

        }
        return result+adder;
    }
}
