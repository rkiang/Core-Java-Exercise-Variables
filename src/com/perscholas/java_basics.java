package com.perscholas;

import java.text.DecimalFormat;

public class java_basics {
    public static void main(String[] args){
        int first = 20;
        int second = 40;
        int additionQuestion = first + second;
        System.out.println("additionQuestion: " + additionQuestion);

        double a;
        double b;
        a = 15.3;
        b = 413.24;
        double addDoubles = a + b;
        System.out.println("addDoubles: " + addDoubles);

        int c = 4;
        double d = 14.2;
        double intPlusDouble = c + d;
        System.out.println("intPlusDouble: " + intPlusDouble);

        int e = 5;
        double f = 10.3;
        double divideBySmall = f / e;
        System.out.println("divideBySmall: " + divideBySmall);

        double g = 30.12;
        double h = 31.42;
        double doubledivision = h / g;
        int castDouble = (int) doubledivision;
        System.out.println("doubleDivision: " + doubledivision +
                " Cast to integer: " + castDouble);

        int x = 5;
        int y = 6;
        double q = (double) y/x;
        System.out.println("q= " + q);

        final double PI = 3.14159;
        final int SIZE = 32;
        final double RADIUS = SIZE*SIZE*PI;
        System.out.println("Radius: " + RADIUS);

        double coffee = 4.75;
        double water = 2.50;
        double muffin = 3.79;
        double subTotal = (coffee * 3) + (water * 4) + (muffin * 2);
        System.out.println("subTotal= " + subTotal);
        final double SALES_TAX = 0.07;
        DecimalFormat df = new DecimalFormat("#.##");
        double totalSale = ((subTotal * SALES_TAX) + subTotal);
        System.out.println("totalSale: " + df.format(totalSale));

    }
}
