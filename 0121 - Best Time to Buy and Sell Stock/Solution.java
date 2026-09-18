class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int min = prices[0];

        for(int i=1; i<n; i++){
            int profit = prices[i] - min;
            max = Math.max(max, profit);
            min = Math.min(prices[i], min);

        }
        return max;
    }
}