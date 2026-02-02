package A2Z.Graphs.TopoSort;
import java.util.*;
public class CycleDetectioninDirectedGraph {
   public boolean cycle(int V, int[][] edges) {
        int[] inDegree = new int[V];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int edge[] : edges) {
            inDegree[edge[1]]++;
            graph.get(edge[0]).add(edge[1]);
        }
        Queue<Integer> que = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                que.add(i);
                result.add(i);
            }
        }
        while (!que.isEmpty()) {
            int node = que.poll();
            for (int neighbor : graph.get(node)) {
                --inDegree[neighbor];
                if (inDegree[neighbor] == 0) {
                    result.add(neighbor);
                    que.add(neighbor);
                }
            }
        }
        return result.size() != V;
    }
}