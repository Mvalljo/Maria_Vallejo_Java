package com.company.pointOfSale;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream strawberryIceCream;

    @Before
    public void setUp() throws Exception {
        strawberryIceCream = new IceCream("strawberry",8.99,20);
    }

    @Test
    public void shouldReturnIceCreamFlavor() {
        assertEquals("strawberry",strawberryIceCream.getFlavor());
    }

    @Test
    public void shouldReturnIceCreamPrice() {
        assertEquals(8.99,strawberryIceCream.getPrice(),0);
    }

    @Test
    public void shouldReturnIceCreamQuantity() {
        assertEquals(20,strawberryIceCream.getQuantity());
    }

    @Test
    public void shouldReturnHigherQuantityBecauseOfRefill() {
        strawberryIceCream.refillQuantity(2);
        assertEquals(22,strawberryIceCream.getQuantity());
    }

    @Test
    public void shouldReturnReducedQuantityBecauseOfScoops() {
        strawberryIceCream.scoop(2);
        assertEquals(0,strawberryIceCream.getQuantity());
    }
    @Test
    public void shouldReturnReducedQuantityBecauseOfSample() {
        strawberryIceCream.sample();
        assertEquals(19,strawberryIceCream.getQuantity());
    }
}