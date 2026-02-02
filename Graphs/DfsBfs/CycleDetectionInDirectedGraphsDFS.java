package A2Z.Graphs.DfsBfs;

public class CycleDetectionInDirectedGraphsDFS {
    public boolean cycle(int[][] graph) {
        int V = graph.length;
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(graph, i, visited, pathVisited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int[][] graph, int node,
                        boolean[] visited, boolean[] pathVisited) {

        visited[node] = true;
        pathVisited[node] = true;

        for (int neighbor : graph[node]) {

            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, visited, pathVisited)) {
                    return true;
                }
            }
            else if (pathVisited[neighbor]) {
                // back edge found
                return true;
            }
        }

        pathVisited[node] = false; // remove from current path
        return false;
    }
}