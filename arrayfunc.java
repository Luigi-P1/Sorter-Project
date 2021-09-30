package com.sparta.lp.sortproject.SorterProject;

public class ArrayFunc {
    static int[] create(int arrSize){
        int[] arr;
        if (arrSize==0){
            arr=null;
        }
            arr = new int[arrSize];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
            }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
