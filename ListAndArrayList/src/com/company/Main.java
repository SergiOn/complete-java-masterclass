package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner s;
    private static int[] baseData;

    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        baseData[10] = 67;
        baseData[11] = 34;
        printArray(baseData);
    }

    private static void getInput() {
        for(int i = 0; i < baseData.length; ++i) {
            baseData[i] = s.nextInt();
        }

    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];

        for(int i = 0; i < original.length; ++i) {
            baseData[i] = original[i];
        }

    }

    static {
        s = new Scanner(System.in);
        baseData = new int[10];
    }
}
