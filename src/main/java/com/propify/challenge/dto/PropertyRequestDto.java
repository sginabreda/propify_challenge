package com.propify.challenge.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class PropertyRequestDto {
	private String createTime;
	@Pattern(regexp = "(SINGLE_FAMILY|MULTI_FAMILY|CONDOMINIUM|TOWNHOUSE)")
	private String type;
	@Min(0)
	@Digits(integer = 6,
	        fraction = 2)
	private double rentPrice;
	@NotNull
	private AddressRequestDto address;
	@Pattern(regexp = ".+@.+\\..+",
	         message = "Invalid email address")
	private String emailAddress;
	@NotNull
	@Pattern(regexp = "[A-Z0-9]{10}")
	private String code;

	public String getCreateTime() {
		return createTime;
	}

	public String getType() {
		return type;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public AddressRequestDto getAddress() {
		return address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getCode() {
		return code;
	}
}
