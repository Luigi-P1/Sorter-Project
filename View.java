package com.sparta.sorterproject.SorterProject;

public class View  {
    public static void finalArr( int[] sortedarray,double time, int choice) {
        System.out.println("Sort used "+ Model.sort(choice)+".");
        System.out.println("The sorted array is:");
        for (int i : sortedarray) {
            System.out.println(i);
        }
        System.out.println("Time taken for "+Model.sort(choice)+": " + time + "s");


    }
}
