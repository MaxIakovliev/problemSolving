package com.problems;

/**
 * Created by Maks on 4/20/2017.
 */
public class InplaceMergeTwoSortedArrays {

    public  void solution1(Integer[] a1, Integer[] a2){
        int i=0;
        int j=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]>a2[j]){
                swap(a1,a2,i,j);
                restoreSortOrder(a2, j);
                //j++;
            }
            else {
                i++;
            }
        }
    }

    private void restoreSortOrder(Integer[] a2, int i) {
        int k=i;

        while(k<a2.length-1){
            if(a2[k]>a2[k+1]){
                swap(a2, k,k+1);
            }
            else k++;

        }
    }

    private void swap(Integer[] a2, int k, int i) {
        int tmp=a2[k];
        a2[k]=a2[i];
        a2[i]=tmp;
    }

    private void swap(Integer[] a1, Integer[] a2, int i, int j) {
        int tmp=a1[i];
        a1[i]=a2[j];
        a2[j]=tmp;
    }


}
