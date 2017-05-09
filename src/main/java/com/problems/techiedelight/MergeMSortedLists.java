package com.problems.techiedelight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Maks on 5/9/2017.
 * http://www.techiedelight.com/merge-m-sorted-lists-variable-length/
 */
public class MergeMSortedLists {

    /*
    1. create new array  the size of summary of size of all lists
    2. copy all the elements into new array
    3. apply efficient sort  O(Nlog(n))
     */
    public  Integer[] simpleSolution(Integer[][] arr){
        int size=0;
        for(int i=0; i<arr.length; i++){
            size+=arr[i].length;
        }
        Integer[] result=new Integer[size];
        int counter=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                result[counter+j]=arr[i][j];
            }
            counter+=arr[i].length;
        }
        Arrays.sort(result);
        return  result;
    }

    /*
    construct a min-heap of size M and insert first element of each list into it.
    Then we pop root element (minimum element) from the heap and insert next element
    from “same” list as popped element. We repeat this process till the heap is exhausted.
     Complexity O(Nlog(M))
     */
    public Integer[] minHeapSolution(Integer[][] arr){
        int size=0;
        for(int i=0; i<arr.length; i++){
            size+=arr[i].length;
        }
        Integer[] result=new Integer[size];
        IntComparator comparator=new IntComparator();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(size, comparator);
        int counter=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                result[counter+j]=arr[i][j];
            }
            counter+=arr[i].length;
        }
        counter=0;
        int j=0;
        while(j<size) {
            for (int i = 0; i < arr.length; i++) {
                if(counter<arr[i].length){
                    pq.add(arr[i][counter]);
                    j++;
                }
            }
            counter++;
        }

        counter=0;
        while(!pq.isEmpty()){
            result[counter]=pq.poll();
            counter++;
        }
        return  result;

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
