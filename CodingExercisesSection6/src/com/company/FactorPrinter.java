package com.company;

public class FactorPrinter {

    public static void main(String[] args) {

        System.out.println("Print factors for 6");
        printFactors(6);

        System.out.println("Print factors for 32");
        printFactors(32);

        System.out.println("Print factors for 10");
        printFactors(10);

        System.out.println("Print factors for -1");
        printFactors(-1);

    }

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

//        int division = 1;

//        while (division <= number) {
//
//            if (number % division == 0) {
//                System.out.println(division);
//            }
//
//            division++;
//        }

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
