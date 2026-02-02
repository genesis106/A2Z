package A2Z.Graphs.DfsBfs;

public class NumberOfProvinces {
    private static void dfs(int[][] isConnected, int[] visited, int node, int V) {
        if (visited[node] == 1) {
            return;
        }
        visited[node] = 1;
        for(int i=0;i<V;i++){
            if(isConnected[node][i]==1){
                dfs(isConnected, visited, i, V);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        int[] visited = new int[V];
        int provinces = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                ++provinces;
                dfs(isConnected, visited, i,V);
            }
        }return provinces;
    }
}
