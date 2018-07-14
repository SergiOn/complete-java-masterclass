package com.company;

public class LeapYear {

    public static void main(String[] args) {

        boolean leapYear = isLeapYear(-1600);
        System.out.println("Leap Year " + leapYear);

        leapYear = isLeapYear(1600);
        System.out.println("Leap Year " + leapYear);

        leapYear = isLeapYear(2017);
        System.out.println("Leap Year " + leapYear);

        leapYear = isLeapYear(2000);
        System.out.println("Leap Year " + leapYear);
    }

    public static boolean isLeapYear(int year) {

        if (year < 1) {
            return  false;
        } else if (year > 9999) {
            return false;
        } else if ((year % 4) == 0 && (year % 100) != 0) {
            return true;
        } else if ((year % 400) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
