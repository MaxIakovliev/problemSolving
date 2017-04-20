package com.problems;

/**
 * Created by Maks on 4/20/2017.
 * Merge two arrays by satisfying given constraints
 Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[] i.e. merge (X, Y) by keeping the sorted order.
 */
public class MergeTwoArraysSatisfyingGivenConstraints {
    public void solution1(Integer[] arr1, Integer[] arr2){
        int j=0;
        int i=0;
        while(j<arr2.length && i<arr1.length-1){
            if(arr2[j]<arr1[i+1]){
                if(arr1[i]==0){
                    arr1[i]=arr2[j];
                    i++;
                    j++;
                }
                else {
                    shiftRight(arr1, i);
                }
            }
            else if(arr1[i]==0){
                moveSlotFurther(arr1, i);
                i++;
            }
            else {
                i++;

            }
        }
        i=arr1.length-1;
        if(j< arr2.length){
            for(int k=arr2.length-1; k>=j; k--){
                arr1[i]=arr2[k];
                i--;
            }
        }
    }

    private void moveSlotFurther(Integer[] arr1, int i) {
        int k=i+1;
        while(k<arr1.length-1){
            if(arr1[i]==0 && arr1[k]!=0){
                swap(arr1,i,k);
                break;
            }
            else
                k++;
        }
    }

    private void shiftRight(Integer[] arr1, int i) {
        int k=arr1.length-1;
        while(k>= i){
            if(arr1[k]==0){
                swap(arr1,k,i);
                k--;
            }
            else k--;
        }
    }

    private void swap(Integer[] arr1, int k, int i) {
        int tmp=arr1[k];
        arr1[k]=arr1[i];
        arr1[i]=tmp;
    }
}
