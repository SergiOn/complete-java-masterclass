package com.company;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println("Greatest common divisor 12, 30 is " + getGreatestCommonDivisor(12, 30));
        System.out.println("Greatest common divisor 25, 15 is " + getGreatestCommonDivisor(25, 15));
        System.out.println("Greatest common divisor 12, 30 is " + getGreatestCommonDivisor(12, 30));
        System.out.println("Greatest common divisor 9, 18 is " + getGreatestCommonDivisor(9, 18));
        System.out.println("Greatest common divisor 81, 153 is " + getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int division = first < second ? first : second;

        while (division > 0) {

            if ((first % division == 0) && (second % division == 0)) {
                break;
            } else {
                division--;
            }
        }

        return division;
    }
}
