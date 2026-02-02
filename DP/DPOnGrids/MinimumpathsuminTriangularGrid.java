package A2Z.DP.DPOnGrids;

import java.util.List;

public class MinimumpathsuminTriangularGrid {
    public int minimumTotal(List<List<Integer>> triangle) {
        int rows=triangle.size();
        int[][] dp=new int[rows][rows];
        for(int i=0;i<rows;i++){
            dp[rows-1][i]=triangle.get(rows-1).get(i);
        }
        for(int i=rows-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }return dp[0][0];
    }
}
