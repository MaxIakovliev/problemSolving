package com.problems.techiedelight;

/**
 * Created by Maks on 5/18/2017.
 * http://www.techiedelight.com/find-first-or-last-occurrence-of-a-given-number-sorted-array/
 */
public class FindFirstOccurrenceInSortedArray {

    public  int findFirstOccurrence(Integer[] arr, int x){
        int lo=0;
        int hi=arr.length-1;
        int res=-1;
        while(lo<=hi){
            int mid= (lo+hi)/2;
            if(arr[mid]==x){
                res=mid;
                hi=mid-1;
            }
            else if(x>arr[mid]){
                lo=mid+1;
            }
            else if(x<arr[mid]){
                hi=mid-1;
            }
        }
        return  res;
    }
}
