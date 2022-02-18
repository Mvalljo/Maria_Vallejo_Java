package com.compnay;

public class Address {

    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street1, String street2, String city, String state, String zipCode) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        if (street2 == " ") {
            return street1 + ", " + city+ ", " + state+ ", " + zipCode ;
        }else if (street2 == ""){
            return street1 + ", " + city+ ", " + state+ ", " + zipCode ;
        }else if (street2 == null){
            return street1 + ", " + city+ ", " + state+ ", " + zipCode ;
        }
        return street1 + ", " + street2+ ", " + city+ ", " + state+ ", " + zipCode ;
    }
}
