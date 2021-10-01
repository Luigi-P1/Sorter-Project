package com.sparta.sorterproject.SorterProject;

public class View  {
    public static void finalArr( int[] sortedarray,double time) {
        System.out.println("The array is:");
        for (int i : sortedarray) {
            System.out.println(i);
        }

        System.out.println("time taken to sort: " + time + "s");


    }
}
