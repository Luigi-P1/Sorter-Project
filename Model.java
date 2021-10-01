package com.sparta.sorterproject.SorterProject;
public class Model {
    public class sortchoice {
        static SortFactory sorts(int choice) {
            SortFactory theFactory = null;
            if (choice == 1)
                theFactory = new BubbleSort();
            else if (choice == 2)
                theFactory = new MergeSort();
            else if (choice == 3)
                theFactory = new QuickSort();
            return theFactory;
        }
    }
    static int [] sorting(SortFactory theFactory, int[] arr) {
        int[] sortedArray=new int[0];
        try {
             sortedArray=theFactory.GetSort(arr);
        }catch (NullPointerException|StackOverflowError npe) {
            System.err.println(npe+" invalid option was chosen for the preferred sorting method. Array was not sorted.");
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
