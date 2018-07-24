package com.company;

public class DecimalComparator {

    public static void main(String[] args) {


        boolean areEqualByDecimal = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("Decimal Comparator " + areEqualByDecimal);

        areEqualByDecimal = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("Decimal Comparator " + areEqualByDecimal);

        areEqualByDecimal = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println("Decimal Comparator " + areEqualByDecimal);

        areEqualByDecimal = areEqualByThreeDecimalPlaces2(3.174, 3.175);
        System.out.println("Decimal Comparator " + areEqualByDecimal);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int firstNumberMultipleThousand = (int) (firstNumber * 1000);
        int secondNumberMultipleThousand = (int) (secondNumber * 1000);

        return firstNumberMultipleThousand == secondNumberMultipleThousand;
    }

    public static boolean areEqualByThreeDecimalPlaces2(double firstNumber, double secondNumber) {

        if (firstNumber == secondNumber) {
            return true;
        }

        if (firstNumber > secondNumber) {
            double numberMinus = (firstNumber * 1000) - (secondNumber * 1000);
            return (numberMinus > 0 && numberMinus < 1);
        }

        if (firstNumber < secondNumber) {
            double numberMinus = (secondNumber * 1000) - (firstNumber * 1000);
            return (numberMinus > 0 && numberMinus < 1);
        }

        return false;
    }
}
