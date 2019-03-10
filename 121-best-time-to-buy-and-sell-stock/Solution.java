class Solution {
  public int maxProfit(int[] prices) {
      if(prices.length == 0) {
          return 0;
      }

      int[] bestBuys = new int[prices.length];
      int[] bestSells = new int[prices.length];

      bestBuys[0] = prices[0];
      bestSells[bestSells.length - 1] = prices[prices.length - 1];

      for(int i = 1; i < prices.length; ++i) {
          bestBuys[i] = Math.min(bestBuys[i - 1], prices[i]);
          bestSells[prices.length - 1 - i] = Math.max(bestSells[prices.length - i], prices[prices.length - 1 - i]);
      }

      int maxProfit = 0;
      for(int i = 0; i < prices.length; ++i) {
          maxProfit = Math.max(maxProfit, bestSells[i] - bestBuys[i]);
      }

      return maxProfit;
  }
}
