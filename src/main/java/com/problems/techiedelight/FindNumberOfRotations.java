package com.problems.techiedelight;

/**
 * Created by Maks on 5/17/2017.
 * http://www.techiedelight.com/find-number-rotations-circularly-sorted-array/
 */
public class FindNumberOfRotations {
    public int linearSolution(Integer[] arr){
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                return  i;
            }
        }
        return 0;
    }

    public  int binaryModifiedSearch(Integer[] arr){
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            if(arr[lo]<=arr[hi]){
                return  lo;
            }

            int mid= (lo+hi)/2;
            int next= (mid+1)%arr.length;
            int prev=(mid-1+arr.length)%arr.length;

            if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]) {
                return mid;
            }
            else if(arr[mid]<=arr[hi]){
                hi=mid-1;
            }
            else if(arr[mid]>=arr[lo]){
                lo=mid+1;
            }
        }
        return  -1;
    }
}
