package com.company;

public class LargestPrime {

    public static void main(String[] args) {

        System.out.println("Largest prime of 21 is " + getLargestPrime(21));
        System.out.println("Largest prime of 217 is " + getLargestPrime(217));
        System.out.println("Largest prime of 0 is " + getLargestPrime(0));
        System.out.println("Largest prime of 45 is " + getLargestPrime(45));
        System.out.println("Largest prime of -1 is " + getLargestPrime(-1));

    }

    public static int getLargestPrime(int number) {

        int startNumber = 2;

        if (number < startNumber) {
            return -1;
        }

        int division = 1;
        int count = startNumber;

        while (count <= number) {

            if (number % count == 0) {

                number /= count;
                division = count;
                count = startNumber;
                continue;
            }

            count++;
        }

        return division;
    }
}
