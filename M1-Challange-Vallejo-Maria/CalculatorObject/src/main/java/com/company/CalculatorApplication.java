package com.company;

public class CalculatorApplication {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(1,1));
        System.out.println(calc.subtract(23,52));
        System.out.println(calc.multiply(34,2));
        System.out.println(calc.divide(12,3));
        System.out.println(calc.divide(12,7));
        System.out.println(calc.add(3.4,12.3));
        System.out.println(calc.multiply(6.7,4.4));
        System.out.println(calc.subtract(5.5,0.5));
        System.out.println(calc.divide(10.8,2.2));
    }
}
