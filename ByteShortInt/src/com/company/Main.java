package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myValue = 10000;
        int myMinValue = -2147483648;
        int myMinValue2 = -2_147_483_648;
        int myMaxValue = 2147483647;
        int myMaxValue2 = 2_147_483_647;
        int myTotal = (myMinValue / 2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = 10;
        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;
        byte myNewByteValue = (byte) (myByteMinValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = 30000;
        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;
        short myNewShortValue = (short) (myShortMaxValue / 2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has a width of 64
        long myLongValue = 100L;
        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;
    }
}
