package com.company;

public class BarkingDog {

    public static void main(String[] args) {

        boolean barkingStatus = bark(true, 1);
        System.out.println("Barking dog " + barkingStatus);

        barkingStatus = bark(false, 2);
        System.out.println("Barking dog " + barkingStatus);

        barkingStatus = bark(true, 8);
        System.out.println("Barking dog " + barkingStatus);

        barkingStatus = bark(true, -1);
        System.out.println("Barking dog " + barkingStatus);
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean barkingStatus = false;

        if (barking && hourOfDay < 8 && hourOfDay >= 0) {
            barkingStatus = true;
        } else if (barking && hourOfDay > 22 && hourOfDay <= 23) {
            barkingStatus = true;
        }

        return barkingStatus;
    }
}
