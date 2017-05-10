package com.problems.techiedelight;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Maks on 5/10/2017.
 * http://www.techiedelight.com/find-smallest-range-least-one-element-given-lists/
 */
public class SmallestRangeInAllLists {

    // Function to compute the minimum range that includes
    // at-least one element from given M lists-
    public Pair<Integer,Integer> solution1(Integer[][] arr){
        PriorityQueue<Range> pq=new PriorityQueue<Range>(comparator);
        //max will be maximum element in the heap
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        Pair<Integer,Integer> res=new Pair<Integer, Integer>(0, Integer.MAX_VALUE);

        for(int i=0; i<arr.length; i++){
            max=Math.max(max, arr[i][0]);
            pq.add(new Range(arr[i][0],i,1));
        }
        // run till end of any list is not reached
        for(;;){
            // get root node information from the min-heap
            min=pq.peek().data;
            int i=pq.peek().array;
            int j=pq.peek().idx;

            pq.poll();

            // update min, max if new min is found
            if(max-min<res.getValue()-res.getKey()){
                res=new Pair<Integer, Integer>(max, max);
            }
            // return on reaching the end of any list
            if(j==arr[i].length-1){
                return  res;
            }
            // take next element from "same" list and
            // insert it into the min-heap
            pq.add(new Range(arr[i][j+1],i,j+1));
            max=Math.max(max, arr[i][j+1]);
        }
    }

    public  class Range{
        // data stores the element,
        // array stores list number of the element
        // idx stores column number of the list from which element was taken
        public final int data;
        public  final int array;
        public  final int idx;

        public Range (int data,int array,int idx) {
            this.data=data;
            this.array=array;
            this.idx=idx;
        }
    }

    public   Comparator<Range> comparator =new Comparator<Range>() {
        // Comparison object to be used to order the heap
        public int compare(Range o1, Range o2) {
            return  o1.data-o2.data;
        }
    };


}
