package com.sparta.lp.sortproject.SorterProject;

public class TreeDriver {
    public static void main(String[] args) {
        int[] theArray={123, 345,234,567,34,566,765,235,555};
        BinaryTree theTree= new BinaryTree();
        for (int nextValue: theArray){
            theTree.add(nextValue);
        }
        System.out.println(theTree);
    }
}
