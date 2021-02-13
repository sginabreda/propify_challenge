package com.propify.challenge.domain;

public class Property {

    private Integer id;
    private String createTime;
    private PropertyType type;
    private double rentPrice;
    private Address address;
    private String emailAddress;
    private String code;

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
