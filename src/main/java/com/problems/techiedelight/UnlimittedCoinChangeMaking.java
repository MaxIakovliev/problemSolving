package com.problems.techiedelight;

/**
 * Created by Maks on 5/24/2017.
 * http://www.techiedelight.com/coin-change-making-problem-unlimited-supply-coins/
 * check this  explanation -https://www.youtube.com/watch?annotation_id=annotation_2195265949&feature=iv&src_vid=Y0ZqKpToTic&v=NJuKJ8sasGk
 */
public class UnlimittedCoinChangeMaking {

    public int bottomUpSolution(Integer[] coins, int total) {
        int[] t = new int[total + 1];
        int[] r = new int[total + 1];
        for (int i = 1; i <= total; i++) {
            t[i] = Integer.MAX_VALUE - 1;
            r[i] = -1;
        }
        t[0] = 0;

        for (int j = 0; j < coins.length; j++) {
            for (int i = 1; i <= total; i++) {
                if (i >= coins[j]) {
                    if (t[i - coins[j]] + 1 < t[i]) {
                        t[i] = 1 + t[i - coins[j]];
                        r[i] = j;
                    }
                }
            }
        }
        return t[total];
    }

}
