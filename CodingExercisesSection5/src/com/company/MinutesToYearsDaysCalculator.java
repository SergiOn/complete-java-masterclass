package com.company;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);

    }

    public static void printYearsAndDays(long minutes) {
        final String INVALID_VALUE_MESSAGE = "Invalid Value";

        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }

        long convertMinutesToDays = minutes / 60 / 24;
        long years = convertMinutesToDays / 365;
        long days = convertMinutesToDays % 365;

        String printFormat = minutes + " min = " + years + " y and " + days + " d";

        System.out.println(printFormat);
    }
}
