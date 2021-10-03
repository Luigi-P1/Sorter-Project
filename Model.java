package com.sparta.sorterproject.SorterProject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Model {
    public class SortChoiceFactory {
        static SortFactory sorts(int choice) {
            SortFactory theFactory = null;
            if (choice == 1)
                theFactory = new BubbleSort();
            else if (choice == 2)
                theFactory = new MergeSort();
            else if (choice == 3)
                theFactory = new QuickSort();
            else if (choice==4)
                theFactory = new InsertionSort();
            else if (choice==5)
                theFactory =new SelectionSort();
            return theFactory;
        }
    }
    static String sort(int choice){
        if (choice==1){
            return "Bubble sort";
        }else if (choice==2){
            return "Merge sort";
        }else if (choice==3){
            return "Quick sort";
        }else if (choice==4){
            return "Insertion sort";
        }else if (choice==5){
            return "Selection sort";
        }
        return null;
    }
    private static Logger logger=Logger.getLogger("My application logger");
    static int [] sorting(SortFactory theFactory, int[] arr) {
        int[] sortedArray=new int[0];
        try {
             sortedArray=theFactory.GetSort(arr);
        }catch (NullPointerException|StackOverflowError npe) {
            System.err.println(npe+" invalid option was chosen for the preferred sorting method. Array was not sorted.");
            PropertyConfigurator.configure("log4j.properties");
            logger.error("This is a message");
            System.exit(0);
        }
        return sortedArray;
    }
    static double duration (SortFactory theFactory, int[] arr){
        long initialTime = System.nanoTime();
        theFactory.GetSort(arr);
        long finalTime = System.nanoTime();
        double duration= (double) (finalTime-initialTime)/1000000000;
        return duration;
    }
}
