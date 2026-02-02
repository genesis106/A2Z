package A2Z.DP.DP1D;

public class FrogJumpwithkdistances {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        boolean[] dp = new boolean[leaves + 1];
        for (int frog : frogs) {
            if(frog<=leaves&&!dp[frog]){
            for (int i = 1; i <= leaves; i++) {
                if (i % frog == 0) {
                    dp[i] = true;
                }
            }}
        }
        int ans = -1;
        for (boolean d : dp) {
            if (!d) {
                ++ans;
            }
        }
        return ans;
    }
}