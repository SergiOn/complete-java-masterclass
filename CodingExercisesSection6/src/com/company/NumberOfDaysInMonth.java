package com.company;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        int numberOfDaysInMonth = getDaysInMonth(1, 2020);
        System.out.println("Month: " + 1 + ", days: " + numberOfDaysInMonth);

        numberOfDaysInMonth = getDaysInMonth(2, 2020);
        System.out.println("Month: " + 2 + ", days: " + numberOfDaysInMonth);

        numberOfDaysInMonth = getDaysInMonth(2, 2018);
        System.out.println("Month: " + 2 + ", days: " + numberOfDaysInMonth);

        numberOfDaysInMonth = getDaysInMonth(-1, 2020);
        System.out.println("Month: " + -1 + ", days: " + numberOfDaysInMonth);

        numberOfDaysInMonth = getDaysInMonth(2, -2020);
        System.out.println("Month: " + 2 + ", days: " + numberOfDaysInMonth);
    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return  false;
        } else if ((year % 4) == 0 && (year % 100) != 0) {
            return true;
        } else if ((year % 400) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }

        boolean februaryIsLeap = (month == 2) && isLeapYear(year);
        if (februaryIsLeap) {
            return 29;
        }

        switch (month) {
            case 1:
                return 31;

            case 2:
                return 28;

            case 3:
                return 31;

            case 4:
                return 30;

            case 5:
                return 31;

            case 6:
                return 30;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 30;

            case 10:
                return 31;

            case 11:
                return 30;

            case 12:
                return 31;

            default:
                return -1;
        }
    }

}
