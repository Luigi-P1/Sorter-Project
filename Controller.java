package com.sparta.lp.sortproject.SorterProject;

import java.util.Scanner;

public class Controller {
    static int[] makearray() {
        System.out.println("How long is the array?");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = ArrayFunc.create(len);
        return arr;
    }
    static int option() {
        System.out.println("what type of sort are you using?" +
                "\r\n 1.Bubble Sort\r\n 2.Merge sort" +
                "\r\n 3.Quick sort\r\n 4.Binary Tree");
        Scanner sorting = new Scanner(System.in);
        int choice = sorting.nextInt();
        return choice;
    }

}
