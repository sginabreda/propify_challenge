package com.propify.challenge.mapper;

import com.propify.challenge.domain.Address;
import com.propify.challenge.dto.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

	public Address toAddress(AddressDto addressDto) {
		Address address = new Address(addressDto.getStreet(), addressDto.getCity(), addressDto.getState(),
				addressDto.getZip(), addressDto.getTimezone());
		return address;
	}
}
