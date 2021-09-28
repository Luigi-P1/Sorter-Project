package com.sparta.lp.sortproject;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("How long is the array?");
        Scanner scan=new Scanner(System.in);
        int len= scan.nextInt();
        int[] arr=arrayfunc.create(len);
        System.out.println("what type of sort are you using?" +
                "\r\n 1.Bubble Sort\r\n 2.Merge sort" +
                "\r\n 3.Quick sort\r\n 4.");
        Scanner sorting=new Scanner(System.in);
        int choice= scan.nextInt();

        long initialTime= System.nanoTime();
        int[] sortedarray= sorts(choice,arr);
        long finalTime=System.nanoTime();
        System.out.println("sorted array:");
        for (int i :sortedarray) {
            System.out.println(i);
        }
        System.out.println("time taken to sort: "+(finalTime-initialTime)+"ns");
    }

    private static int[] sorts(int choice, int[]arr)  {
        if (choice==1){
            return bubleSort.bubbleSort(arr);
        }else if (choice==2){
            return mergeSort.mergeSort(arr);
        }else if (choice==3){
            return quickSort.quickSort(arr,0,arr.length-1);
        }else {
            return null;
        }

    }
}
