package com.repetition;

/**
 * Created by Maks on 10/20/2017.
 */
public class SelectionSort {
    public void sort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    min = j;
            }
            if (min > 0)
                swap(arr, i, min);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int[] arr = new int[10];
        int count = 0;
        for (int i = 10; i > 0; i--) {
            arr[count++] = i;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
        sort.sort(arr);
        System.out.println();
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
