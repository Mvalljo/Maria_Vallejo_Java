package com.company.pointOfSale;

public class IceCreamApp {

    public static void main(String[] args) {

        IceCream bananaNut = new IceCream(
                "Banana Nut",
                8.99,
                20
        );

        System.out.println("Flavor: " + bananaNut.getFlavor());
        System.out.println("Price: " + bananaNut.getPrice());
        System.out.println("Quantity: " + bananaNut.getQuantity() + " oz");

        System.out.println("----Refill quantity-----");
        bananaNut.refillQuantity(2);
        System.out.println("Quantity: " + bananaNut.getQuantity() + " oz");

        System.out.println("----Scoops-----");
        bananaNut.scoop(2);
        System.out.println(" ");
        System.out.println("Quantity: " + bananaNut.getQuantity() + " oz");

        System.out.println("----Sample-----");
        bananaNut.sample();
        System.out.println("Quantity: " + bananaNut.getQuantity() + " oz");
    }
}
