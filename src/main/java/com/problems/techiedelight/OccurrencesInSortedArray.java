package com.problems.techiedelight;

/**
 * Created by Maks on 5/18/2017.
 * http://www.techiedelight.com/count-occurrences-number-sorted-array-duplicates/
 */
public class OccurrencesInSortedArray {

    public int count(Integer[] arr, int x){
        int lo=0;
        int hi=arr.length-1;
        int res=0;
        int idx=-1;
        boolean isLeft=true;
        while(lo<=hi && hi<=arr.length-1){
            int mid=(lo+hi)/2;
            if(arr[mid]==x && idx==-1){
                idx=mid;
                res++;
                hi=mid-1;
            }
            else if(arr[mid]==x && isLeft && idx!=-1){
                res++;
                hi=mid-1;
            }
            else  if(arr[mid]==x && !isLeft && idx !=-1){
                res++;
                lo=mid+1;

            }
            else if(x>arr[mid] && idx!=-1){
                isLeft=false;
                lo=idx+1;
                hi=idx+2;
            }
            else if(x<arr[mid] && idx!=-1){
                return  res;
            }
            else if(x<arr[mid]&& idx==-1){
                hi=mid-1;
            }
            else if(x>arr[mid] && idx==-1){
                lo=mid+1;
            }
        }
        return  res;
    }
}
