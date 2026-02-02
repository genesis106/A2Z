package A2Z.Graphs.DfsBfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {
    public static boolean isBipartite(int[][] graph) {
        Queue<Integer> que = new LinkedList<>();
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            if (color[i] != 0) {
                continue;
            }
            color[i] = 1;
            que.add(i);
            while (!que.isEmpty()) {
                int node = que.poll();
                for (int neighbor : graph[node]) {
                    if (color[neighbor] == color[node]) {
                        return false;
                    } else if (color[neighbor] == 0) {
                        color[neighbor] = color[node] ^ 2 ^ 1;
                        que.add(neighbor);
                    }

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBipartite(new int[][] { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } }));
    }
}
