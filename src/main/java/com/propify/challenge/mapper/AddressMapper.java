package com.propify.challenge.mapper;

import com.propify.challenge.domain.Address;
import com.propify.challenge.dto.AddressDto;
import com.propify.challenge.dto.AddressRequestDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

	public Address toAddress(AddressRequestDto addressDto) {
		return new Address(null, addressDto.getStreet(), addressDto.getCity(), addressDto.getState(),
				addressDto.getZip(), addressDto.getTimezone());
	}

	public AddressDto toAddressDto(Address address) {
		return new AddressDto(address.getId(), address.getStreet(), address.getCity(), address.getState(),
				address.getZip(), address.getTimezone());
	}
}
