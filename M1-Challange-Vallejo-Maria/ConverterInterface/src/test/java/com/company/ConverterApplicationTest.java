package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterApplicationTest {
    Converter number;

    @Before
    public void setUp() throws Exception {
        number = new ConverterIf();
//        number = new ConverterSwitch();
    }

    @Test
    public void shouldReturnTheConvertedMonth()  throws Exception {
        assertEquals("January", number.convertMonth(1));
        assertEquals("June", number.convertMonth(6));
    }

    @Test
    public void shouldReturnErrorMessageForMonth() throws Exception {
        assertEquals("Number is not between 1 and 12.", number.convertMonth(16));
        assertEquals("Number is not between 1 and 12.", number.convertMonth(-5));
    }

    @Test
    public void shouldReturnTheConvertedDay() throws Exception{
        assertEquals("Sunday", number.convertDay(1));
        assertEquals("Thursday", number.convertDay(5));
    }

    @Test
    public void shouldReturnErrorMessageForDay() throws Exception {
        assertEquals("Number is not between 1 and 7.", number.convertDay(16));
        assertEquals("Number is not between 1 and 7.", number.convertDay(-5));
    }
}