package com.sparta.sorterproject;

public class SelectionSort extends SortFactory{
    @Override
    public int[] GetSort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            ArrayFunc.swap(arr,i,min_idx);
        }
    return arr;
    }
}
