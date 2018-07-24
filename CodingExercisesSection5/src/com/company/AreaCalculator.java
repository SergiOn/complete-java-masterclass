package com.company;

public class AreaCalculator {

    public static void main(String[] args) {

        double circleArea = area(5.0);
        System.out.println("Circle area " + circleArea);

        double rectangleArea = area(5.0, 4.0);
        System.out.println("Rectangle area " + rectangleArea);
    }

    public static double area(double radius) {
        final double INVALID_VALUE = -1d;
        final double PI = 3.14159d;

        if (radius < 0) {
            return INVALID_VALUE;
        }

        return radius * radius * PI;
    }

    public static double area(double x, double y) {
        final double INVALID_VALUE = -1d;
        final double PI = 3.14159d;

        if ((x < 0) || (y < 0)) {
            return INVALID_VALUE;
        }

        return x * y;
    }

}
