class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_price = prices[0];
        for(int i=0;i<prices.length;i++){
            int profit = prices[i] - min_price;
            max_profit = Math.max(max_profit, profit);
            min_price = Math.min(min_price, prices[i]);
        }
        return max_profit;
    }
}
