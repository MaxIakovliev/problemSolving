package com.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maks on 5/1/2017.
 * http://www.techiedelight.com/longest-increasing-subsequence/
 * Very good explanation can be found here: http://www.geeksforgeeks.org/longest-monotonically-increasing-subsequence-size-n-log-n/
 */
public class LongestIncreasingSubsequence {

    public static List<Integer> solution1(Integer[] arr){
        List<Integer> res=new ArrayList<Integer>();
        res.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i]<res.get(0)){
                res.set(0, arr[i]);
            }
            else if(arr[i]>res.get(res.size()-1)){
                res.add(arr[i]);
            }
            else {
                res.set(ceilIndex(res,-1, res.size()-1, arr[i]), arr[i]);
            }

        }
        return  res;

    }

    // Binary search
    private static int ceilIndex(List<Integer> q, int l, int r, int key){
        while(r-l>1){
            int mid=l+(r-l)/2;
            if(q.get(mid)>=key){
                r=mid;
            }
            else{
                l=mid;
            }
        }
        return  r;
    }

    public static void main(String[] args) {
        // write your code here
        Integer input[] = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
         List<Integer> res= solution1(input);
        for(Integer a: res){
            System.out.print(a+" ");
        }
        System.out.println();

        Integer input2[] = {9,8,7,6,5,4,3,2,1 };
        res= solution1(input2);
        for(Integer a: res){
            System.out.print(a+" ");
        }

        System.out.println();

        Integer input3[] = {9,8,7,6,5,4,3,2,1,4 };
        res= solution1(input3);
        for(Integer a: res){
            System.out.print(a+" ");
        }
    }

}
