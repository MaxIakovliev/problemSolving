package com.problems.leetcode.DynamicProgramming;

/**
 * Created by Maks on 8/9/2018.
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int t1=0;
        int t2=Integer.MIN_VALUE;
        for (int price : prices){
            int prev_t1=t1;
            t1=Math.max(t1, t2+price);
            t2=Math.max(t2, prev_t1-price);
        }
        return t1;
    }

    public static void main(String[] args) {
        // write your code here
        BestTimetoBuyandSellStockII c=new BestTimetoBuyandSellStockII();
        System.out.println(c.maxProfit(new int[]{7, 1, 5, 3, 6, 4})); //7
        System.out.println(c.maxProfit(new int[]{1, 2, 3, 4, 5})); //4
        System.out.println(c.maxProfit(new int[]{7, 6, 4, 3, 1})); //0
        System.out.println(c.maxProfit(new int[]{6, 1, 3, 2, 4, 7})); //7

    }
}
