package A2Z.DP.DP1D;

public class FrogJumpwithkdistances {
    public static int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        int[] dp = new int[leaves + 1];
        for (int i = 0; i < N; i++) {
            int strength = frogs[i];
            if(strength==1){return 0;}
            if(strength>leaves||dp[strength]==1){continue;}
            for (int j = strength; j <= leaves; j += strength) {
                dp[j] = 1;
            }
        }
        int ans = 0;
        for (int d : dp) {
            if (d == 0) {
                ++ans;
            }
        }return ans-1;
    }
    public static void main(String[] args) {
        System.out.println(unvisitedLeaves(3, 6, new int[]{1,3,5}));
    }
}
