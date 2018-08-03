package com.company;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println("Sum of even number 123456789 " + getEvenDigitSum(123456789));
        System.out.println("Sum of even number 252 " + getEvenDigitSum(252));
        System.out.println("Sum of even number -22 " + getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            if (digit % 2 == 0) {
                sum += digit;
            }
        }

        return sum;
    }
}
