package com.propify.challenge.domain;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;
    private String timezone;

    public Address(String street, String city, String state, String zip, String timezone) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.timezone = timezone;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getTimezone() {
        return timezone;
    }
}
