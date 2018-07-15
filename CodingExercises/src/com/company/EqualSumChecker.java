package com.company;

public class EqualSumChecker {

    public static void main(String[] args) {

        boolean equalSum = hasEqualSum(1, 1, 1);
        System.out.println("Equal Sum Checker " + equalSum);

        equalSum = hasEqualSum(1, 1, 2);
        System.out.println("Equal Sum Checker " + equalSum);

        equalSum = hasEqualSum(1, -1, 0);
        System.out.println("Equal Sum Checker " + equalSum);
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int sumNumber) {
        return (firstNumber + secondNumber) == sumNumber;
    }
}
