package com.company;

public class Main {

    public static void main(String[] args) {

        String time = getDurationString(2, 10);
        System.out.println("Time " + time);

        time = getDurationString(65, 10);
        System.out.println("Time " + time);

        time = getDurationString(10);
        System.out.println("Time " + time);

        time = getDurationString(70);
        System.out.println("Time " + time);

    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String fullHours = hours < 10 ? "0" + hours : "" + hours;
        String fullMinutes = remainingMinutes < 10 ? "0" + remainingMinutes : "" + remainingMinutes;
        String fullSeconds = seconds < 10 ? "0" + seconds : "" + seconds;

        return fullHours + "h " + fullMinutes + "m " + fullSeconds + "s";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

}
