package com.company;

public class NumberToWords {

    public static void main(String[] args) {

        System.out.println("Digit count of 0 is " + getDigitCount(0));
        System.out.println("Digit count of 123 is " + getDigitCount(123));
        System.out.println("Digit count of -12 is " + getDigitCount(-12));
        System.out.println("Digit count of 5200 is " + getDigitCount(5200));

        System.out.println("Revers number of -121 is " + reverse(-121));
        System.out.println("Revers number of 1212 is " + reverse(1212));
        System.out.println("Revers number of 1234 is " + reverse(1234));
        System.out.println("Revers number of 100 is " + reverse(100));

        System.out.println("Number to world 123");
        numberToWords(123);
        System.out.println("Number to world 1010");
        numberToWords(1010);
        System.out.println("Number to world 1000");
        numberToWords(1000);
        System.out.println("Number to world -12");
        numberToWords(-12);

    }

    public static void numberToWords(int number) {
        String INVALID_MESSAGE = "Invalid Value";

        if (number < 0) {
            System.out.println(INVALID_MESSAGE);
            return;
        }

        int count = getDigitCount(number);
        number = reverse(number);

        while (count > 0) {

            int lastNumber = number % 10;
            number /= 10;
            count--;

            switch (lastNumber) {

                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {

        int symbol = 1;

        if (number < 0) {
            number *= -1;
            symbol = -1;
        }

        int reverseNumber = 0;

        while (number > 0) {

            int digit = number % 10;
            number /= 10;
            reverseNumber = reverseNumber * 10 + digit;
        }

        return symbol * reverseNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number > 0) {

            number /= 10;
            count++;
        }

        return count;
    }
}
