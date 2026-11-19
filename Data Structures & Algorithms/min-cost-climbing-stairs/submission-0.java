class Solution {
    public static int minCost(int cost[], int dp[], int idx){
        if(idx == 0 || idx == 1){
            return cost[idx];
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int ones = cost[idx] + minCost(cost, dp, idx-1);
        int twos = cost[idx] + minCost(cost, dp, idx-2);
        return dp[idx] = Math.min(ones, twos);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min(minCost(cost, dp, n-1), minCost(cost, dp, n-2));
    }
}
