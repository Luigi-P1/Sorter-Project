package com.sparta.sorterproject;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class View  {
    private static Logger logger=Logger.getLogger("Sorter application logger");
    public static void finalArr( int[] sortedarray,double time, int choice) {
        PropertyConfigurator.configure("log4j.properties");
        String sorterOutput=Model.sortOutput(choice);
        logger.info(sorterOutput+" was picked.");

        System.out.println("Sort used "+sorterOutput +".");
        System.out.println("The sorted array is:");
        for (int i : sortedarray) {
            System.out.println(i);
        }
        System.out.println("Time taken for "+sorterOutput+": " + time + "s");


    }
}
