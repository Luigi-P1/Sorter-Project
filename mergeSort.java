package com.sparta.lp.sortproject;

public class mergeSort extends sort{
    static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        } else {
            int len = (int) (array.length / 2);
            int arrayone[] = new int[len];
            int arraytwo[] = new int[array.length - len];
            for (int i = 0; i <= len - 1; i++) {
                arrayone[i] = array[i];
            }
            for (int i = len; i < array.length; i++) {
                arraytwo[i - len] = array[i];
            }
            arrayone = mergeSort(arrayone);
            arraytwo = mergeSort(arraytwo);
            return merge(arrayone,arraytwo);
        }
    }

    static int[] merge(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        int c[] = new int[aLen + bLen];
        int aPosition = 0;
        int bPosition = 0;
        int cPosition = 0;
        while (aPosition < aLen && bPosition < bLen) {
            if (a[aPosition] > b[bPosition]) {
                c[cPosition] = b[bPosition];
                bPosition++;
            } else {
                c[cPosition] = a[aPosition];
                aPosition++;
            }
            cPosition++;
        }
        while (aPosition < aLen) {
            c[cPosition] = a[aPosition];
            aPosition++;
            cPosition++;
        }
        while (bPosition < bLen) {
            c[cPosition] = b[bPosition];
            bPosition++;
            cPosition++;
        }
        return c;
    }
}
