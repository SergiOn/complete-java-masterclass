package com.company;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println("The digits are shared 12 and 23 " + hasSharedDigit(12, 23));
        System.out.println("The digits are shared 9 and 99 " + hasSharedDigit(9, 99));
        System.out.println("The digits are shared 15 and 55 " + hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

//        while (number1 > 0) {
//
//            int digit1 = number1 % 10;
//            number1 /= 10;
//
//            while (number2 > 0) {
//                int digit2 = number2 % 10;
//                number2 /= 10;
//
//                if (digit1 == digit2) {
//                    return true;
//                }
//            }
//        }
//
//        return false;

        int digit11 = number1 % 10;
        number1 /= 10;
        int digit12 = number1 % 10;

        int digit21 = number2 % 10;
        number2 /= 10;
        int digit22 = number2 % 10;

        return digit11 == digit21 || digit11 == digit22 || digit12 == digit21 || digit12 == digit22;
    }
}
