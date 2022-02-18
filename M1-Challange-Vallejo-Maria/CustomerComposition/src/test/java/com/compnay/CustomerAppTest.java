package com.compnay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerAppTest {

    Customer john;
    Address address;

    @Before
    public void setUp() throws Exception {
        address = new Address(
                "1610 clack",
                " ",
                "Houston",
                "Texas",
                "45962"
        );
        john = new Customer(
                "John",
                "Doe",
                "jdoe7@hotmail.com",
                "4126308956",
                address,
                address,
                true);
    }

    @Test
    public void shouldReturnFirstName() {
        assertEquals("John",john.getFirstName());
    }

    @Test
    public void shouldReturnLastName() {
        assertEquals("Doe",john.getLastName());
    }

    @Test
    public void shouldReturnEmail() {
        assertEquals("jdoe7@hotmail.com",john.getEmail());
    }

    @Test
    public void shouldReturnPhoneNumber() {
        assertEquals("4126308956",john.getPhoneNumber());
    }

    @Test
    public void shouldReturnShippingAddress() {
        assertEquals("1610 clack, Houston, Texas, 45962",john.getShippingAddress().toString());
    }

    @Test
    public void shouldReturnBillingAddress() {
        assertEquals("1610 clack, Houston, Texas, 45962",john.getBillingAddress().toString());
    }

    @Test
    public void shouldReturnRewardsMemberTrue() {
        assertTrue(john.isRewardsMember());
    }
}