class Solution {
    public static int count(int n, int dp[]){
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ones = count(n-1, dp);
        int second = count(n-2, dp);
        dp[n] = ones + second;
        return dp[n]; 
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return count(n, dp);
    }
}
