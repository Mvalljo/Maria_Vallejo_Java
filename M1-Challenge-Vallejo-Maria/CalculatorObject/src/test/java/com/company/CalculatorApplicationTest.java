package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorApplicationTest {

    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void shouldReturnSumOfTwoInts() {
        assertEquals("4 + 4 = 8", calc.add(4,4));
        assertEquals("25 + 50 = 75", calc.add(25,50));
    }

    @Test
    public void shouldReturnSumOfTwoDoubles() {
        assertEquals("4.8 + 6.8 = 11.6", calc.add(4.8,6.8));
        assertEquals("9.9 + 9.5 = 19.4", calc.add(9.9,9.5));
    }

    @Test
    public void shouldReturnDifferenceOfTwoInts() {
        assertEquals("4 - 4 = 0", calc.subtract(4,4));
        assertEquals("47 - 4 = 43", calc.subtract(47,4));
    }

    @Test
    public void shouldReturnDifferenceOfTwoDoubles() {
        assertEquals("4.9 - 2.2 = 2.7", calc.subtract(4.9,2.2));
        assertEquals("4.5 - 4.6 = -0.09999999999999964", calc.subtract(4.5,4.6));
    }

    @Test
    public void shouldReturnProductOfTwoInts() {
        assertEquals("4 * 4 = 16", calc.multiply(4,4));
        assertEquals("5 * 4 = 20", calc.multiply(5,4));
    }

    @Test
    public void shouldReturnProductOfTwoDoubles() {
        assertEquals("4.8 * 2.2 = 10.56", calc.multiply(4.8,2.2));
        assertEquals("8.4 * 7.2 = 60.480000000000004", calc.multiply(8.4,7.2));
    }

    @Test
    public void shouldReturnQuotientOfTwoInts() {
        assertEquals("4 / 2 = 2", calc.divide(4,2));
        assertEquals("50 / 2 = 25", calc.divide(50,2));
    }

    @Test
    public void shouldReturnQuotientOfTwoDoubles() {
        assertEquals("10.5 / 2.5 = 4.2", calc.divide(10.5,2.5));
        assertEquals("15.1 / 5.2 = 2.9038461538461537", calc.divide(15.1,5.2));
    }
}