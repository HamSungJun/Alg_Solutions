package Leetcode.Easy.Algorithm;

class Solution_121 {
    public int maxProfit(int[] prices) {

        int maxPrice = Integer.MIN_VALUE;
        int maxProfit = 0;

        for (int i = prices.length - 1; i >= 0; i--) {

            if (maxPrice < prices[i]) {

                maxPrice = prices[i];

            } else {

                maxProfit = Math.max(maxProfit, maxPrice - prices[i]);

            }

        }

        return maxProfit;

    }
}
