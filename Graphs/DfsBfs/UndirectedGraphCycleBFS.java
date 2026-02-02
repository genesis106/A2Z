package A2Z.Graphs.DfsBfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraphCycleBFS {
    static class Pair {
        int node, parent;

        Pair(int no, int ne) {
            node = no;
            parent = ne;
        }

    }

    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        boolean[] visited = new boolean[V];
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                queue.add(new Pair(i, -1));
                while (!queue.isEmpty()) {
                    Pair p = queue.poll();
                    visited[p.node] = true;
                    for (int neighbor : graph.get(p.node)) {
                        if (visited[neighbor]) {
                            if (neighbor != p.parent) {
                                return true;
                            } else {
                                continue;
                            }
                        } else {
                            queue.add(new Pair(neighbor, p.node));
                        }
                    }
                }
            }
        }
        return false;
    }
}