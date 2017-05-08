package com.problems.techiedelight;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Maks on 5/8/2017.
 * http://www.techiedelight.com/sort-k-sorted-array/
 */
public class SortKSortedArray {

    public  void solution1(Integer[] arr, int k){


        IntComparator comparator=new IntComparator();
        PriorityQueue<Integer> q= new PriorityQueue<Integer>(comparator);
        for(int i=0; i<=k; i++){
            q.add(arr[i]);
        }

        int idx=0;
        for(int i=k+1; i<arr.length; i++){
            arr[idx]=q.poll();
            q.add(arr[i]);
            idx++;
        }

        while(!q.isEmpty()){
            arr[idx]=q.poll();
            idx++;
        }

    }

    public class IntComparator implements Comparator<Integer>{

        public int compare(Integer o1, Integer o2) {
            if(o1<o2)
                return  -1;
            if(o1>o2)
                return  1;
            else return  0;
        }
    }

}
