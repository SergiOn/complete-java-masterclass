package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
        -Before the user enters the number, print the message "Enter number:"
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

        Hint:
        -Use an endless while loop.

        Bonus:
        -Create a project with the name MinAndMaxInputChallenge.
        */

        Scanner scanner = new Scanner(System.in);

//        int min = 0;
//        int max = 0;
//        boolean first = true;

//        int min = 2147483647;
//        int max = -2147483648;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {

            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                break;
            }

            int number = scanner.nextInt();
            scanner.nextLine();

//            if (first) {
//                first = false;
//                max = number;
//                min = number;
//            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        scanner.close();

        System.out.println("The min number is: " + min);
        System.out.println("The max number is: " + max);
    }
}
