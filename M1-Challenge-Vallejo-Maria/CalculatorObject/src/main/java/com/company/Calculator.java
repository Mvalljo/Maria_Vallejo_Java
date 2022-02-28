package com.company;

public class Calculator {

    public String add(int a, int b) {
        return a + " + " + b +" = " + (a+b);
    }

    public String add(double a, double b) {
        return a + " + " + b +" = " + (a+b);
    }

    public String subtract(int a, int b) {

        return a + " - " + b +" = " + (a - b);
    }

    public String subtract(double a, double b) {

        return a + " - " + b +" = " + (a - b);
    }

    public String multiply(int a, int b) {
        return a + " * " + b +" = " + (a * b);
    }

    public String multiply(double a, double b) {
        return a + " * " + b +" = " + (a * b);
    }

    public String divide(int a, int b) {
        return a + " / " + b +" = " + (a / b);
    }

    public String divide(double a, double b) {
        return a + " / " + b +" = " + (a / b);
    }
}
