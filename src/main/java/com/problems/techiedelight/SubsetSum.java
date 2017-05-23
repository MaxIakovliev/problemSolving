package com.problems.techiedelight;

/**
 * Created by Maks on 5/23/2017.
 * http://www.techiedelight.com/subset-sum-problem/
 */
public class SubsetSum {

    public  boolean solution1(Integer[] arr, int sum){
        return recursive(arr, arr.length-1, sum);
    }

    private boolean recursive(Integer[] arr, int i, int sum) {
        if(sum==0){
            return  true;
        }

        if(i<0 ||sum<0){
            return  false;
        }

        boolean include= recursive(arr, i-1, sum-arr[i]);
        boolean exclude= recursive(arr, i-1, sum);

        return  include||exclude;
    }
}
