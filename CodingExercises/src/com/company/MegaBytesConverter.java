package com.company;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String format = "Invalid Value";
        int oneMBToKB = 1024;

        if (kiloBytes >= 0) {

            int KB = kiloBytes % oneMBToKB;
            int MB = (kiloBytes - KB) / oneMBToKB;

            format = kiloBytes + " KB = " + MB + " MB and " + KB + " KB";
        }

        System.out.println(format);
    }

}
