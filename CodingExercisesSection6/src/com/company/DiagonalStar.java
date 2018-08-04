package com.company;

public class DiagonalStar {

    public static void main(String[] args) {

        System.out.println("Print square star 5");
        printSquareStar(5);

        System.out.println("Print square star 8");
        printSquareStar(8);

    }

    public static void printSquareStar(int number) {
        String INVALID_MESSAGE = "Invalid Value";

        if (number < 5) {
            System.out.println(INVALID_MESSAGE);
            return;
        }

        for (int r = 1; r <= number; r++) {

            for (int c = 1; c <= number; c++) {

                if ((r == 1) || (r == number) || (c == 1) || (c == number) || (r == c) || (c == (number - r + 1))) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}
