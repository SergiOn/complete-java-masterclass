package com.company;

public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println("Is perfect number 6 " + isPerfectNumber(6));
        System.out.println("Is perfect number 28 " + isPerfectNumber(28));
        System.out.println("Is perfect number 5 " + isPerfectNumber(5));
        System.out.println("Is perfect number -1 " + isPerfectNumber(-1));

    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int halfNumber = (number + 1) / 2;
        int count = 1;
        int sum = 0;

        while (count <= halfNumber) {

            if (number % count == 0) {
                sum += count;
            }
            count++;
        }

        return sum == number;
    }
}
