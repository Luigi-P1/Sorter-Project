package com.sparta.sorterproject.SorterProject;
public class BubbleSort extends SortFactory {
    @Override
    public int[] GetSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    ArrayFunc.swap(array, j, j + 1);
                }
            }
        }
        return array;
    }
}
