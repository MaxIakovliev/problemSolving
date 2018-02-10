package com.problems.leetcode;

/**
 * Created by Maks on 2/10/2018.
 * https://leetcode.com/problems/can-i-win/description/
 */
public class CanIWin {
    private Boolean[] memory;

    public boolean canIWin(int maxInt, int total) {
        memory=new Boolean[1<<20];
        if(total<2) {
            return true;
        }
        if(total>maxInt*(maxInt+1)/2){
            return  false;
        }
        return calculate(maxInt,total,0,0);

    }

    private  boolean calculate(int maxInt, int total, int s,int selected){

        if (memory[selected] != null)
            return memory[selected];
        if (s >= total) {
            memory[selected] = false;
            return false;
        }
        for (int i = 1; i <= maxInt; i++) {
            int bit = 1 << (i - 1);
            if ((selected & bit) == 0) {
                selected ^= bit;
                boolean ulose = !calculate(maxInt, total, s + i,selected);
                selected ^= bit;

                if (ulose) {
                    memory[selected] = true;
                    return true;
                }
            }
        }
        memory[selected] = false;
        return false;
    }
}
