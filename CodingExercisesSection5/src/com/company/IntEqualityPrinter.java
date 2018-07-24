package com.company;

public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int number1, int number2, int number3) {
        final String INVALID_VALUE_MESSAGE = "Invalid Value";
        final String NUMBERS_EQUAL_MESSAGE = "All numbers are equal";
        final String NUMBERS_DIFFERENT_MESSAGE = "All numbers are different";
        final String NEITHER_EQUAL_OR_DIFFERENT_MESSAGE = "Neither all are equal or different";

        if ((number1 < 0) || (number2 < 0) || (number3 < 0)) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }

        if ((number1 == number2) && (number1 == number3)) {
            System.out.println(NUMBERS_EQUAL_MESSAGE);
            return;
        }

        if ((number1 != number2) && (number1 != number3) && (number2 != number3)) {
            System.out.println(NUMBERS_DIFFERENT_MESSAGE);
            return;
        }

        System.out.println(NEITHER_EQUAL_OR_DIFFERENT_MESSAGE);
    }
}
