package com.problems.techiedelight;

/**
 * Created by Maks on 5/13/2017.
 * http://www.techiedelight.com/merge-sort/
 */
public class MergeSort {

    public  void sort(Integer[] arr){
        sort(arr, 0, arr.length-1);
    }
    private void sort(Integer[] arr, int lo, int hi){
        if(hi<=lo) return;
        int mid= lo+ (hi-lo)/2;
        sort(arr,lo, mid);
        sort(arr,mid+1, hi);
        merge(arr,lo,mid, hi);
    }

    private void merge(Integer[] arr, int lo, int mid, int hi){
        int n1=mid-lo+1;
        int n2=hi-mid;

        Integer[] L=new Integer[n1];
        Integer[] R=new Integer[n2];
        for(int k=0; k<=n1; k++){
            L[k]=arr[k+lo];
        }

        for(int k=0;k<n2; k++){
            R[k]=arr[k+mid+1];
        }
        int i=0;
        int j=0;
        int k=lo;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else {
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }

    }
}
