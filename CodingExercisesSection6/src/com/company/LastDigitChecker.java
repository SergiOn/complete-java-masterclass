package com.company;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println("Is the same last digit 41, 22, 71 " + hasSameLastDigit(41, 22, 71));
        System.out.println("Is the same last digit 23, 32, 42 " + hasSameLastDigit(23, 32, 42));
        System.out.println("Is the same last digit 9, 99, 999 " + hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (number1 < 10 || number1 > 1000 || number2 < 10 || number2 > 1000 || number3 < 10 || number3 > 1000) {
            return false;
        }

        int digit1 = number1 % 10;
        int digit2 = number2 % 10;
        int digit3 = number3 % 10;

        return digit1 == digit2 || digit1 == digit3 || digit2 == digit3;
    }
}
