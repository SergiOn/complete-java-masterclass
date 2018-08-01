package com.company;

public class SumOddRange {

    public static void main(String[] args) {

        int number = sumOdd(1, 100);
        System.out.println(number);

        number = sumOdd(-1, 100);
        System.out.println(number);

        number = sumOdd(100, 100);
        System.out.println(number);

        number = sumOdd(100, -100);
        System.out.println(number);

        number = sumOdd(100, 1000);
        System.out.println(number);
    }

    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        }

        if (number % 2 != 0) {
            return true;
        }

        return false;
    }

    public static int sumOdd(int start, int end) {

        if ((start < 0) || (end < 0) || (start > end)) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {

            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
