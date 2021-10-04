package com.sparta.sorterproject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    static int[] makearray() {
        System.out.println("How long is the array?");
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = ArrayFunc.create(len);
        return arr;
    }
    static List option() {
        List <String>choice= new ArrayList();
        Scanner sorting;
        Scanner another;
        System.out.println("what type of sort are you using?" +
                "\r\n 1.Bubble Sort\r\n 2.Merge sort" +
                "\r\n 3.Quick sort\r\n 4.Insertion sort\r\n 5.Selection sort");
        sorting = new Scanner(System.in);
        choice.add( sorting.next());
        System.out.println("Use another sort? (y/n)");
        another= new Scanner(System.in);
        String anotherSort=another.next();
        while (anotherSort.equals("y")){
            System.out.println("what type of sort are you using?" +
                    "\r\n 1.Bubble Sort\r\n 2.Merge sort" +
                    "\r\n 3.Quick sort\r\n 4.Insertion sort\r\n 5.Selection sort");
            sorting = new Scanner(System.in);
            choice.add( sorting.next());
            System.out.println("Use another sort? (Type \"y\" for yes or anything else for no)");
            another= new Scanner(System.in);
            anotherSort=another.next();
            anotherSort=anotherSort.toLowerCase();
        }
        return choice;
    }
}