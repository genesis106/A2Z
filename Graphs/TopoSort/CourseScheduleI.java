package A2Z.Graphs.TopoSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseScheduleI {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int inDegree[] = new int[numCourses];
        Queue<Integer> que = new LinkedList<>();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            inDegree[edge[0]]++;
            graph.get(edge[1]).add(edge[0]);
        }
        int completed = 0;
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                que.add(i);
                ++completed;
            }
        }
        while (!que.isEmpty()) {
            int node = que.poll();
            for (int neighbor : graph.get(node)) {
                --inDegree[neighbor];
                if (inDegree[neighbor] == 0) {
                    que.add(neighbor);
                    ++completed;
                }
            }
        }return completed==numCourses;
    }
}