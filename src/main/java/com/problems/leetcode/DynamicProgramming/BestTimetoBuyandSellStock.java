package com.problems.leetcode.DynamicProgramming;

/**
 * Created by Maks on 8/9/2018.
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimetoBuyandSellStock {
    /**
     * explanation of method here:
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/discuss/108870/Most-consistent-ways-of-dealing-with-the-series-of-stock-problems
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int t1=0;
        int t2=Integer.MIN_VALUE;
        for(int price:prices){
            t1=Math.max(t1, t2+price);
            t2=Math.max(t2, -price);
        }
        return t1;

    }
}
