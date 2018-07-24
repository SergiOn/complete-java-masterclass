package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        String time = getDurationString(2, 10);
        System.out.println("Time " + time);

        time = getDurationString(65, 10);
        System.out.println("Time " + time);

        time = getDurationString(10);
        System.out.println("Time " + time);

        time = getDurationString(70);
        System.out.println("Time " + time);

        time = getDurationString(3700);
        System.out.println("Time " + time);

        time = getDurationString(-41);
        System.out.println("Time " + time);

    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours < 10 ? "0" + hours + "h" : "" + hours + "h";
        String minutesString = remainingMinutes < 10 ? "0" + remainingMinutes + "m" : "" + remainingMinutes  + "m";
        String secondsString = seconds < 10 ? "0" + seconds  + "s" : "" + seconds + "s";

        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

}
