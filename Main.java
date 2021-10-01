package com.sparta.sorterproject.SorterProject;
public class Main {
    public static void main(String[] args){
        int choice= Controller.option();
        int[] arr= Controller.makearray();
        SortFactory sortType = Model.sortchoice.sorts(choice);
        int[] finalArray = Model.sorting(sortType, arr);
        double duration= Model.duration(sortType,arr);
        View.finalArr(finalArray,duration);
    }
}