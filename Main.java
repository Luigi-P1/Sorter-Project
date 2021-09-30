package com.sparta.lp.sortproject.SorterProject;


public class Main {
    public static void main(String[] args){
        int choice= Controller.option();
        int[] arr= Controller.makearray();
        int[] array=Model.sorts(choice,arr);
        View.finalArr(array);
    }
}