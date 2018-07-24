package com.company;

public class TeenNumberChecker {
    public static void main(String[] args) {

        boolean hasTeenNumber = hasTeen(9, 99, 19);
        System.out.println("Teen Number Checker " + hasTeenNumber);

        hasTeenNumber = hasTeen(23, 15, 42);
        System.out.println("Teen Number Checker " + hasTeenNumber);

        hasTeenNumber = hasTeen(22, 23, 34);
        System.out.println("Teen Number Checker " + hasTeenNumber);
    }

    public static boolean hasTeen(int number1, int number2, int number3) {
        int minRange = 13;
        int maxRange = 19;

        boolean hasTeenNumber = number1 >= minRange && number1 <= maxRange
                || number2 >= minRange && number2 <= maxRange
                || number3 >= minRange && number3 <= maxRange;

        return hasTeenNumber;
    }
}
