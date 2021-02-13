package com.propify.challenge.domain;

public class Address {

    private Integer id;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String timezone;

    public Address(Integer id, String street, String city, String state, String zip, String timezone) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.timezone = timezone;
    }

    public Integer getId() {
        return id;
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
