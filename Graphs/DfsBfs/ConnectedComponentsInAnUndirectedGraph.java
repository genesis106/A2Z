package A2Z.Graphs.DfsBfs;

import java.util.ArrayList;

public class ConnectedComponentsInAnUndirectedGraph {
    private void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, ArrayList<Integer> component, int node) {
        if (visited[node]) {
            return;
        }  visited[node]=true;
        component.add(node);
        for(int neighbor:graph.get(node)){
            if(!visited[neighbor]){
                dfs(graph, visited, component, neighbor);
            }
        }
    }

    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0], v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[V];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                ArrayList<Integer> component = new ArrayList<>();
                dfs(graph, visited, component, i);
                result.add(component);
            }
        }
        return result;
    }
}
