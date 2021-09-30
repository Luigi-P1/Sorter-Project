package com.sparta.lp.sortproject.SorterProject;

public class Model {
    static int[] sorts(int choice, int[] arr) {
        SortFactory theFactory=null;
        if (choice==1)
            theFactory=new BubbleSort();
        else if (choice==2)
            theFactory=new MergeSort();
        else if (choice==3)
            theFactory=new QuickSort();
        long initialTime;
        long finalTime;
        try {
            initialTime = System.nanoTime();
            arr=theFactory.GetSort(arr);
            finalTime = System.nanoTime();
            double duration= (double) (finalTime-initialTime)/1000000000;
            System.out.println("Time taken for sort: "+duration+"s");
        }catch (NullPointerException|StackOverflowError npe) {
            System.err.println(npe+" invalid option was chosen for the preferred sorting method. Array was not sorted.");
            System.exit(0);
        }
        return arr;
    }
}
