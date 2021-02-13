package com.propify.challenge.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class AddressRequestDto {

	@NotNull
	@NotBlank
	private String street;
	@NotNull
	@NotBlank
	private String city;
	@NotNull
	@NotBlank
	@Pattern(regexp = "[A-Z]{2}")
	private String state;
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9]{5}")
	private String zip;
	private String timezone; // Must be a valid timezone

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
