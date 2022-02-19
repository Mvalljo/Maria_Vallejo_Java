package com.company.factory;

import java.util.Arrays;

public class IceCreamApp {

    public static void main(String[] args) {

        String[] bananaNutIngredients = {"Banana's","nut's","vanilla ice cream"};

        IceCream bananaNut = new IceCream(
                "Banana Nut",
                8.99,
                89.56,
                5,
                bananaNutIngredients
        );

        System.out.println("Flavor: " + bananaNut.getFlavor());
        System.out.println("Sale Price: " + bananaNut.getSalePrice());
        System.out.println("Production Cost: " + bananaNut.getProductionCost());
        System.out.println("Production Time: " + bananaNut.getProductionTime() + " hrs");
        System.out.println("Ingredients: " + bananaNut.getIngredients());

        System.out.println("----Order Flavor------");
        bananaNut.orderFlavor(2.5);

        System.out.println("-----Replace Ingredient------");
        bananaNut.replaceIngredient(0,"organic banana's");
        System.out.println("Ingredients: " + bananaNut.getIngredients());

        System.out.println("------Change Production Cost--------");
        bananaNut.changeProductionCost(9.99);
        System.out.println("Production Cost: " + bananaNut.getProductionCost());


    }
}
