package A2Z.DP.DPOnGrids;

public class NinjasTraining {
    public static int ninjaTraining(int n, int[][] points) {
        return helper(n, points, 0);
    }

    private static int helper(int n, int[][] points, int index){
        if(index==n){return 0;}
        int activity1=points[index][0]+Math.max(helper(n, points, index+1),helper(n, points, index+1)),
        activity2=points[index][1]+Math.max(helper(n, points, index+1),helper(n, points, index+1)),
        activity3=points[index][2];
    }
}
