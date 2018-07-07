package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = result + 1;
        System.out.println("Result now is " + result);

        result++;
        System.out.println("Result now is " + result);

        result--;
        System.out.println("Result now is " + result);

        result += 2;
        System.out.println("Result now is " + result);

        result *= 10;
        System.out.println("Result now is " + result);

        result -= 10;
        System.out.println("Result now is " + result);

        result /= 10;
        System.out.println("Result now is " + result);

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;

//        if (topScore == 100) {
//        if (topScore != 100) {
//        if (topScore > 100) {
//        if (topScore < 100) {
//        if (topScore <= 100) {
//        if (topScore >= 100) {
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;

        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater then top score and less then 100");
        }


        topScore = 80;

        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        secondTopScore = 81;

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater then top score and less then 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these tests is true");
        }

        int newValue = 50;

//        if (newValue = 50) { // looking for boolean
        if (newValue == 50) {
//            System.out.println("This is an error");
            System.out.println("This is true");
        }

        boolean isCar = false;

        // if (isCar = true) { // doesn't have error because boolean
        if (isCar == true) {
            System.out.println("This is not supported to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}
