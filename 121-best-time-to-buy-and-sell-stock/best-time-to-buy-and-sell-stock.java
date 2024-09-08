class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int[] minPricesByIndex = new int[prices.length];
        int[] currentProfit = new int[prices.length];
        minPricesByIndex[0] = prices[0];

        for(int i = 1; i < prices.length; i++)
            minPricesByIndex[i] = Math.min(minPricesByIndex[i-1], prices[i]);

        for(int i = 0; i < prices.length; i++)
            currentProfit[i] = prices[i] - minPricesByIndex[i];

        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++)
            maxProfit = Math.max(maxProfit, currentProfit[i]);

        return maxProfit;
    }
}