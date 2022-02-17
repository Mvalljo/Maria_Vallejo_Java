package com.company;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Converter numberMonth = new ConverterIf();
//        Converter numberMonth = new ConverterSwitch();
        String userInputMonth = "";
        int userMonthNumber =0;

        do {
            try {
                System.out.println("What is the number you you wish to convert to a month?");
                userInputMonth = scan.nextLine();
                userMonthNumber = Integer.parseInt(userInputMonth);
                String userConvertedMonth = numberMonth.convertMonth(userMonthNumber);
                System.out.println("Month " + userMonthNumber + " : " + userConvertedMonth);
            } catch (NumberFormatException e) {
                System.out.println("You must type in a number. You typed in: " + userInputMonth);
            }
        }while (userMonthNumber < 1 || userMonthNumber > 12);

        Converter numberDay = new ConverterIf();
//        Converter numberDay = new ConverterSwitch();
        String userInputDay = "";
        int userDayNumber =0;

        do {
            try {
                System.out.println("What is the number you wish to convert to a day?");
                userInputDay = scan.nextLine();
                userDayNumber = Integer.parseInt(userInputDay);
                String userConvertedDay = numberDay.convertDay(userDayNumber);
                System.out.println("Day " + userDayNumber + " : " + userConvertedDay);
            } catch (NumberFormatException e) {
                System.out.println("You must type in a number. You typed in: " + userInputDay);
            }
        }while (userDayNumber < 1 || userDayNumber > 7);

    }
}
