package com.company;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println("Sym of first and last digit of number 252 is " + sumFirstAndLastDigit(252));
        System.out.println("Sym of first and last digit of number 257 is " + sumFirstAndLastDigit(257));
        System.out.println("Sym of first and last digit of number 0 is " + sumFirstAndLastDigit(0));
        System.out.println("Sym of first and last digit of number 5 is " + sumFirstAndLastDigit(5));
        System.out.println("Sym of first and last digit of number -10 is " + sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

//        int firstDigit = 0;
//        int lastDigit = 0;
//        boolean firstIteration = true;
//
//        while (number > 0) {
//
//            int digit = number % 10;
//            number /= 10;
//
//            if (firstIteration) {
//                firstIteration = false;
//                firstDigit = digit;
//            }
//
//            if (number == 0) {
//                lastDigit = digit;
//            }
//        }
//
//        return firstDigit + lastDigit;

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number > 0) {

            int digit = number % 10;
            number /= 10;

            if (number == 0) {
                firstDigit = digit;
            }
        }

        return firstDigit + lastDigit;
    }
}
