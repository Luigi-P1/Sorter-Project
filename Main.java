package com.sparta.sorterproject.SorterProject;

import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> choice= Controller.option();
        int[] arr= Controller.makearray();
        for (int i = 0; i<choice.size(); i++) {
            int sortChoice=Integer.parseInt(choice.get(i));
            SortFactory sortType = Model.SortChoiceFactory.sorts(sortChoice);
            int[] finalArray = Model.sorting(sortType, arr);
            double duration = Model.duration(sortType, arr);
            View.finalArr(finalArray, duration,sortChoice);
        }
    }
}