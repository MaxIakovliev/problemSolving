package com.problems.geeksforgeeks.dp;

/**
 * Created by Maks on 9/2/2017.
 * http://www.geeksforgeeks.org/minimum-cost-to-fill-given-weight-in-a-bag/
 */
public class MinimumCost {

    public int solution1(int[] price, int bagSize) {
        int res[] = new int[bagSize + 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.MAX_VALUE;
        }
        res[0] = 0;

        for (int i = 1; i <= price.length; i++) {
            if (price[i-1] == -1)
                continue;

            for (int j = i; j <= bagSize; j++) {
                if (res[j - i] != Integer.MAX_VALUE) {
                    res[j] = Math.min(res[j], price[i - 1] + res[j - i]);
                }
            }
        }
        return res[bagSize] == Integer.MAX_VALUE ? -1 : res[bagSize];
    }

    public static void main(String[] args) {
        int cost[] = {20, 10, 4, 50, 100};
        System.out.println(new MinimumCost().solution1(cost,5));

        cost = new int[] {1, 10, 4, 50, 100};
        System.out.println(new MinimumCost().solution1(cost,5));

        cost = new int[] {1, 2, 3, 4, 5};
        System.out.println(new MinimumCost().solution1(cost,5));

        cost = new int[] {-1, -1, 4, 5, -1};
        System.out.println(new MinimumCost().solution1(cost,5));
    }
}
