package A2Z.Graphs.DfsBfs;

public class FloodFill {
    static int[][] direction = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

    private void dfs(int[][] image, int sr, int sc, int ogColor, int color) {
        if (image[sr][sc] == color) {
            return;
        }
        image[sr][sc] = color;
        for (int[] d : direction) {
            int x = sr + d[0], y = sc + d[1];
            if (x < image.length && x >= 0 && y < image[0].length && y >= 0 && image[x][y] == ogColor) {
                dfs(image, x, y, ogColor, color);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }
}

