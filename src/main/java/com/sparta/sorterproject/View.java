package com.sparta.sorterproject;

public class View  {
    public static void finalArr( int[] sortedarray,double time, int choice) {
        String sorterOutput=Model.sortOutput(choice);
        System.out.println("Sort used "+sorterOutput +".");
        System.out.println("The sorted array is:");
        for (int i : sortedarray) {
            System.out.println(i);
        }
        System.out.println("Time taken for "+sorterOutput+": " + time + "s");


    }
}
