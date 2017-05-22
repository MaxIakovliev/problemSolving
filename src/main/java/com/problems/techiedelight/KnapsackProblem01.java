package com.problems.techiedelight;

/**
 * Created by Maks on 5/22/2017.
 * http://www.techiedelight.com/0-1-knapsack-problem/
 */
public class KnapsackProblem01 {
    public int recursiveSolution(Integer[] weights, Integer[] vals,int size,  int limit){
        if(size<0 || limit==0) {
            return 0;
        }

        if(limit<0){
            return Integer.MIN_VALUE;
        }

        int include=vals[size]+recursiveSolution(weights,vals,size-1,limit-weights[size]);
        int exclude=recursiveSolution(weights,vals,size-1, limit);

        return Math.max(include,exclude);
    }
}
