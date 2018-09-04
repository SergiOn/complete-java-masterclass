package com.company;

/**
 * Created by dev on 20/11/2015.
 */
public class StaticTest {
//    private int numInstances = 0;
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

//    public int getNumInstances() {
//        return numInstances;
//    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
