package com.company;

public class ConverterIf implements Converter {

    String[] months = {
            "null",
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    String[] days = {
            "null",
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday"
    };


    @Override
    public String convertMonth(int monthNumber) {
        if (monthNumber <= 12 && monthNumber >= 1) {
            return months[monthNumber];
        }else {
            return  "Number is not between 1 and 12.";
        }
    }

    @Override
    public String convertDay(int dayNumber) {
        if (dayNumber <= 7 && dayNumber >= 1) {
            return days[dayNumber];
        }else {
            return  "Number is not between 1 and 7.";
        }
    }
}
