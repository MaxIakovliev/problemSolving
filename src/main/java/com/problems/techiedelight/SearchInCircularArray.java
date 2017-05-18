package com.problems.techiedelight;

/**
 * Created by Maks on 5/18/2017.
 * http://www.techiedelight.com/search-element-circular-sorted-array/
 */
public class SearchInCircularArray {

    public  int findElement(Integer[] arr, int x){
        int lo=0;
        final int n=arr.length;
        int hi=arr.length-1;
        while(lo<=hi){

            int mid =(lo+hi)/2;
            if(arr[mid]==x){
                return mid;
            }
            int next=(mid+1)%n;
            int prev= (mid-1+n)%n;

            if(arr[mid]<=arr[hi]){
                if(x>arr[mid] && x<=arr[hi]){
                    lo=mid+1;
                }
                else {
                    hi=mid-1;
                }
            }
            else {
                if(x>=arr[lo] && x<arr[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
        }
        return  -1;
    }
}
