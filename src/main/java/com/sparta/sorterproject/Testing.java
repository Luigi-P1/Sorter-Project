package com.sparta.sorterproject;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testing {
    public static int[] standardArray= {5,7,2,3,9,6};
    @Test

    public void ArrayfunctionTests(){
        ArrayFunc ArrayFunctionTester= new ArrayFunc();


        ArrayFunctionTester.swap(standardArray,0,3);
        assertTrue(ArrayFunctionTester.create(4).length==4);
        assertTrue(standardArray[0]==3);
    }
    @Test
    public void sortTests(){
        int[] arrayNew;
        int[] standardSortedArray= {2,3,5,6,7,9};
        int[] arrayWithNegativeNums={-5,7,-2,3,-9,6};
        int[] sortedArrayWithNegativeNums={-9,-5,-2,3,6,7};
        int[] arrayOfZero={0,0,0,0};
        SortFactory sorter=null;
        for (int i=1;i<6;i++){
            sorter= Model.SortChoiceFactory.sorts(i);
            arrayNew=sorter.GetSort(standardArray);
            assertTrue(Arrays.equals(standardSortedArray,arrayNew));
            arrayNew=sorter.GetSort(arrayWithNegativeNums);
            assertTrue(Arrays.equals(sortedArrayWithNegativeNums,arrayNew));
            arrayNew=sorter.GetSort(arrayOfZero);
            assertTrue(Arrays.equals(arrayOfZero,arrayNew));

        }
    }
    @Test
    public void TimeTest(){
        SortFactory sorter=Model.SortChoiceFactory.sorts(2);

        assertTrue(Model.duration(sorter,standardArray)>0);
    }

}
