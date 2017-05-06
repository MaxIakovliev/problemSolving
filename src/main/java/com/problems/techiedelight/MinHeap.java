package com.problems.techiedelight;

/**
 * Created by Maks on 5/6/2017.
 * http://www.techiedelight.com/min-heap-max-heap-implementation-c/
 * implementation of minheap
 */
public class MinHeap {

    private int total;
    public  void sort(Integer[] arr){
        total=arr.length-1;
        buildMinHeap(arr);
        for(int i=total; i>0; i--){
            swap(arr,0,i);
            total--;
            minHeapify(arr,0);
        }
    }

    public void buildMinHeap(Integer[] arr){
        for(int i=total/2; i>=0; i--){
            minHeapify(arr, i);
        }

    }

    private void minHeapify(Integer[] arr,int i){
        int l=left(i);
        int r=right(i);
        int smallest=i;
        if(l<=total && arr[l].compareTo(smallest)<0){
            smallest=l;
        }

        if(r<=total && arr[r].compareTo(smallest)<0){
            smallest=r;
        }
        if(smallest!=i){
            swap(arr,i, smallest);
            minHeapify(arr, smallest);
        }
    }

    private void swap(Integer[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    private int left(int i){
        return  i*2;
    }

    private int right(int i){
        return left(i)+1;
    }

    private int parent(int i){
        return  i/2;
    }


}
