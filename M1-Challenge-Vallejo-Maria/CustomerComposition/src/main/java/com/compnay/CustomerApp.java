package com.compnay;

import java.util.List;

public class CustomerApp {

    public static void main(String[] args) {

        Address shippingAddress = new Address(
                "1910 somewhere",
                null,
                "Austin",
                "Texas",
                "15962");

        Address billingAddress = new Address(
                "1010 somewhere",
                "Unit 21",
                "Austin",
                "Texas",
                "15962");

        Customer alex = new Customer(
                "Alex",
                "Vause",
                "avause@hotmail.com",
                "2156908512",
                shippingAddress,
                billingAddress,
                true);

        System.out.println("------------------------");
        System.out.println("Customers Information");
        System.out.println("------------------------");
        System.out.println("First Name: " + alex.getFirstName());
        System.out.println("Last Name: " + alex.getLastName());
        System.out.println("Email: " + alex.getEmail());
        System.out.println("Phone Number: " + alex.getPhoneNumber());
        System.out.println("Shipping Address: " + alex.getShippingAddress());
        System.out.println("Billing Address: " + alex.getBillingAddress());
        System.out.println("Rewards Member: " + alex.isRewardsMember());


    }
}
