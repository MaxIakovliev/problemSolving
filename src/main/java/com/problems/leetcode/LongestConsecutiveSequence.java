package com.problems.leetcode;

import java.util.HashSet;
import java.util.Iterator;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> u=new HashSet<>();
        int maxSoFar=0;
        for (int item:nums){
            u.add(item);
        }
        while (u.size()>0){
            Iterator<Integer> it=u.iterator();
            int item=it.next();
            u.remove(item);
            int cur=item;
            int count=1;
            cur++;
            while (u.contains(cur)){
                u.remove(cur);
                cur++;
                count++;
            }
            cur=item;
            cur--;
            while(u.contains(cur)){
                u.remove(cur);
                cur--;
                count++;
            }
            maxSoFar=Math.max(maxSoFar, count);
        }
        return maxSoFar;
    }
}
