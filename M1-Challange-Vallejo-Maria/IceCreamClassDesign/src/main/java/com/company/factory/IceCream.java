package com.company.factory;

import java.util.Arrays;

public class IceCream {

    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String[] ingredients;

    public IceCream(
            String flavor,
            double salePrice,
            double productionCost,
            int productionTime,
            String[] ingredients
    ) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public void replaceIngredient(int index, String ingredient) {
        ingredients[index] = ingredient;
    }

    public void orderFlavor(double quantity) {
        System.out.println(quantity+" gallons of "+flavor+" ice cream will take "+productionTime * quantity+" hours to produce.");
        System.out.println("It will cost "+productionCost * quantity+" to produce and should be sold at "+salePrice * quantity);
    }

    public void changeProductionCost(double newProductionCost){
        productionCost = newProductionCost;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return  Arrays.toString(ingredients);
    }
}
