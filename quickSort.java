package com.sparta.lp.sortproject;

public class quickSort extends sort{
    static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++){
            if (arr[j] < pivot){
                i++;
                arrayfunc.swap(arr, i, j);
            }
        }
        arrayfunc.swap(arr, i + 1, high);
        return (i + 1);
    }
    static int[] quickSort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }
}
