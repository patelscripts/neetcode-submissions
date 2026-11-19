class Solution {
    public static int count(int up, int left, int dp[][]){
        // base case likhte hai
        if(up == 0 && left == 0) return 1;
        if(up < 0 || left < 0) return 0;
        if(dp[up][left] != -1){
            return dp[up][left];
        }
        int first = count(up-1, left, dp);
        int second = count(up, left-1, dp);
        return dp[up][left] = first + second;
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for(int i = 0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return count(m-1, n-1, dp);
    }
}
