package com.company;

public class FlourPacker {

    public static void main(String[] args) {

        System.out.println("Is can pack 1, 0, 4 " + canPack(1, 0, 4));
        System.out.println("Is can pack 1, 0, 5 " + canPack(1, 0, 5));
        System.out.println("Is can pack 0, 5, 4 " + canPack(0, 5, 4));
        System.out.println("Is can pack 2, 2, 12 " + canPack(2, 2, 12));
        System.out.println("Is can pack -3, 2, 12 " + canPack(-3, 2, 12));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigBagWeight = 5;

        for (int i = 1; i <= bigCount; i++) {

            int bigCountPack = i * bigBagWeight;
            int countPack = bigCountPack + smallCount;

            if ((bigCountPack <= goal) && (countPack >= goal)) {
                return true;
            }
        }

        return smallCount >= goal;
    }
}
