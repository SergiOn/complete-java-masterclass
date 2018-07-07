package com.company;

public class Main {

    public static void main(String[] args) {
        // width of int 32 (4 bytes).
        int myIntValue = 5;
        int myIntValueDivide = 5 / 3;
        // width of float 32 (4 bytes).
        float myFloatValue = 5f;
        float myFloatValue2 = (float) 5.4;
        float myFloatValue3 = 5.4f;
        float myFloatValueDivide = 5f / 3f;
        // width of double 64 (8 bytes).
        double myDoubleValue = 5d;
        double myDoubleValueDivide = 5d / 3d;
        double myDoubleValue2 = 5.25;
        System.out.println("myIntValue " + myIntValue);
        System.out.println("myFloatValue " + myFloatValue);
        System.out.println("myDoubleValue " + myDoubleValue);
        System.out.println("myIntValueDivide " + myIntValueDivide);
        System.out.println("myFloatValueDivide " + myFloatValueDivide);
        System.out.println("myDoubleValueDivide " + myDoubleValueDivide);

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms " + convertedKilograms);

        double pi = 3_000_000.141_592_7d;
    }
}
