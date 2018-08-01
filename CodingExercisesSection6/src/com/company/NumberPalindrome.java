package com.company;

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println("The number -1221 is the palindrome: " + isPalindrome(-1221));
        System.out.println("The number 707 is the palindrome: " + isPalindrome(707));
        System.out.println("The number 11212 is the palindrome: " + isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int savedNumber = number;
        int reserved = 0;

        while (number > 0) {

            reserved *= 10;

            int lastDigit = number % 10;
            reserved += lastDigit;
            number /= 10;
        }

        return reserved == savedNumber;
    }
}
