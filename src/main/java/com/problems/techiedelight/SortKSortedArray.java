package com.problems.techiedelight;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Maks on 5/8/2017.
 * http://www.techiedelight.com/sort-k-sorted-array/
 */
public class SortKSortedArray {

    public  void solution1(Integer[] arr, int k){

        Queue<Integer> q= new PriorityQueue<Integer>();
        for(int i=0; i<k; i++){
            q.add(arr[i]);
        }

        int idx=0;
        for(int i=k; i<arr.length; i++){
            arr[idx]=q.poll();
            q.add(arr[i]);
            idx++;
        }

        while(!q.isEmpty()){
            arr[idx]=q.poll();
            idx++;
        }

    }

}
