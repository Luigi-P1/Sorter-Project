package com.sparta.sorterproject.SorterProject;
public class QuickSort extends SortFactory {
    @Override

    public int[] GetSort(int[] arr) {

        return quicksort(arr,0,arr.length-1);
    }
    public int[] quicksort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
        return arr;
    }
    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++){
            if (arr[j] < pivot){
                i++;
                ArrayFunc.swap(arr, i, j);
            }
        }
        ArrayFunc.swap(arr, i + 1, high);
        return (i + 1);
    }

}
