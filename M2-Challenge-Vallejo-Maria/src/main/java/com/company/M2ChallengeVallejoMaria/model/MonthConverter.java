package com.company.M2ChallengeVallejoMaria.model;

public class MonthConverter {

    private int number;
    private String month;

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

    public MonthConverter() {
    }

    public String getConvertedMonth(int number){
        return months[number];
    };

    public void getRandomConvertedMonth(){
        int min = 1;
        int max = 12;
        int randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);
        setNumber(randomNumber);
        setMonth(months[randomNumber]);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
