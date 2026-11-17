class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i<prices.length-1; i++){
            for(int j = i + 1; j<prices.length; j++){
                int currProfit = prices[j] - prices[i];
                maxProfit = Math.max(currProfit, maxProfit);
            }
        }
        if(maxProfit < 0){
            return 0;
        }
        return maxProfit;
    }
}
