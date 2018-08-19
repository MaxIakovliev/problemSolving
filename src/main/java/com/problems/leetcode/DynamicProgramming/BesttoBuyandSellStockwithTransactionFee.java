package com.problems.leetcode.DynamicProgramming;

/**
 * Created by Maks on 8/9/2018.
 */
public class BesttoBuyandSellStockwithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length <= 1)
            return 0;
        int days = prices.length;
        int[] buy = new int[days];
        int[] sell = new int[days];
        buy[0] = -prices[0];
        for (int i = 1; i < days; i++) {
            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i] - fee);
        }

        return sell[days - 1];

    }
}
