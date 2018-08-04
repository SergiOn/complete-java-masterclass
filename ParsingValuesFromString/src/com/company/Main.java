package com.company;

public class Main {

    public static void main(String[] args) {

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);


        String numberAsString2 = "2018.125";
        System.out.println("numberAsString2 = " + numberAsString);

        double number2 = Double.parseDouble(numberAsString2);
        System.out.println("number2 = " + number2);

        numberAsString2 += 1;
        number2 += 1;

        System.out.println("numberAsString2 = " + numberAsString2);
        System.out.println("number2 = " + number2);

    }
}
