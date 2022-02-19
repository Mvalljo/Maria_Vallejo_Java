package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream bananaNut ;

    @Before
    public void setUp() throws Exception {
        String[] bananaNutIngredients = {"Banana's","nut's","vanilla ice cream"};
        bananaNut = new IceCream(
                "Banana Nut",
                8.99,
                89.56,
                5,
                bananaNutIngredients
        );
    }

    @Test
    public void shouldReturnIceCreamFlavor() {
        assertEquals("Banana Nut",bananaNut.getFlavor());
    }

    @Test
    public void shouldReturnIceCreamSalePrice() {
        assertEquals(8.99,bananaNut.getSalePrice(),0);
    }

    @Test
    public void shouldReturnIceCreamProductionCost() {
        assertEquals(89.56,bananaNut.getProductionCost(),0);
    }

    @Test
    public void shouldReturnIceCreamProductionTime() {
        assertEquals(5,bananaNut.getProductionTime());
    }

    @Test
    public void shouldReturnIceCreamIngredients() {
        assertEquals("[Banana's, nut's, vanilla ice cream]",bananaNut.getIngredients());
    }

    @Test
    public void shouldReturnReplaceOneIngredient(){
        bananaNut.replaceIngredient(0,"organic banana's");
        assertEquals("[organic banana's, nut's, vanilla ice cream]",bananaNut.getIngredients());
    }

    @Test
    public void shouldReturnNewProductionCost() {
        bananaNut.changeProductionCost(9.99);
        assertEquals(9.99,bananaNut.getProductionCost(),0);
    }
}