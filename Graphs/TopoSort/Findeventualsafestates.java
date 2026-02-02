package A2Z.Graphs.TopoSort;

import java.util.*;

public class Findeventualsafestates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        ArrayList<ArrayList<Integer>> mGraph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            mGraph.add(new ArrayList<>());
        }
        int[] inDegree = new int[V];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                int neighbor = graph[i][j];
                mGraph.get(neighbor).add(i);
                inDegree[i]++;
            }
        }

        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                que.add(i);
                result.add(i);
            }
        }
        while (!que.isEmpty()) {
            int node = que.poll();
            for (int neighbor : mGraph.get(node)) {
                --inDegree[neighbor];
                if (inDegree[neighbor] == 0) {
                    result.add(neighbor);
                    que.add(neighbor);
                }
            }
        }
        return result;
    }
}