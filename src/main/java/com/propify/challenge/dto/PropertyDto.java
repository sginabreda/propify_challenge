package com.propify.challenge.dto;

public class PropertyDto {

	private Integer id;
	private String createTime;
	private String type;
	private double rentPrice;
	private AddressDto address;
	private String emailAddress;
	private String code;

	public PropertyDto(Integer id, String createTime, String type, double rentPrice, AddressDto address, String emailAddress, String code) {
		this.id = id;
		this.createTime = createTime;
		this.type = type;
		this.rentPrice = rentPrice;
		this.address = address;
		this.emailAddress = emailAddress;
		this.code = code;
	}
}
