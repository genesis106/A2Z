package A2Z.Graphs.DfsBfs;
import java.util.*;
public class UndirectedGraphCycleDFS {
    private static boolean dfs(int V, ArrayList<ArrayList<Integer>> graph, int node, int parent,boolean[] visited){
        visited[node]=true;
        for(int neighbor:graph.get(node)){
            if(visited[neighbor]){
                if(neighbor!=parent){
                    return true;
                }else{
                    continue;
                }
            }else{
                if(dfs(V, graph, neighbor, node, visited)){return true;}
            }
        }return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        boolean[] visited=new boolean[V];
        for(int[] e:edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(V,graph,i,-1,visited)){return true;}
            }
        }
        return false;
    }
}