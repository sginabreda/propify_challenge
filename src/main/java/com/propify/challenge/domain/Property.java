package com.propify.challenge.domain;

public class Property {

    private Integer id; // must be null for INSERT and not null for UPDATE

    private String createTime;

    private PropertyType type;

    private double rentPrice; // must be greater than 0, 2 decimal places

    private Address address; // must not be null

    private String emailAddress; // must be a valid email address

    private String code; // not null, only uppercase letters or numbers, 10 characters

    public Property(Integer id, String createTime, PropertyType type, double rentPrice, Address address, String emailAddress, String code) {
        this.id = id;
        this.createTime = createTime;
        this.type = type;
        this.rentPrice = rentPrice;
        this.address = address;
        this.emailAddress = emailAddress;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public PropertyType getType() {
        return type;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getCode() {
        return code;
    }
}
