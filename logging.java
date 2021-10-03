package com.sparta.sorterproject.SorterProject;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class logging {
    private static Logger logger=Logger.getLogger("My application logger");
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
        logger.error("This is a message");
    }
}
