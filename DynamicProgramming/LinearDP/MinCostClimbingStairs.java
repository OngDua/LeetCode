package DynamicProgramming.LinearDP;

public class MinCostClimbingStairs {
    public int MinCostClimbingStairs(int[] cost){
        int length = cost.length;
        int[] dp = new int[length];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2;i< length;i++){
            dp[i] = Math.min(dp[i-1] + cost[i - 1], dp[i-2] + cost[i-2]);
        }
        return Math.min(dp[length - 1] + cost[length - 1], dp[length - 2] + cost[length - 2]);
    }
}
