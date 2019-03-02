package com.problems.leetcode.DynamicProgramming;

import java.util.HashMap;

public class ContinuousSubarraySum {
    /*
    1. when there are two subsequent 0, whatever k is, we should return true, because 0*k=0;
    2. when k==0 and there are no two subsequent 0, return false;
    3. iterate through the array, sum+=nums[i], calculate the mod = sum%k, if the same mod has appeared before when i=j, then sum(nums(j...i])==n*k
    4. we put m[0]==-1 at the beginning, think nums = {1,1} and k = 2, sum(nums[0...1])%2=0, so this makes it apply the previous statement;
    5. we need to do the check "if (!( m[0]==-1 && i==0))", in case situations like nums={1} and k=1
     */
    public boolean checkSubarraySum(int[] nums, int k) {
        //case1
        for (int i=0; i<nums.length-1; i++){
            if (nums[i]==nums[i+1] && nums[i]==0){
                return  true;
            }
        }
        //case 2
        if (k==0){
            return  false;
        }
        HashMap<Integer,Integer> m= new HashMap<>();
        m.put(0,-1);
        Integer sum=0;
        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
            sum%=k;
            if (m.containsKey(sum)){
                if (!(i==0 && m.get(0)!=-1)){
                    return  true;
                }
            }
            m.put(sum,i);
        }
        return  false;

    }
}
