package com.propify.challenge.mapper;

import com.propify.challenge.domain.Property;
import com.propify.challenge.domain.PropertyType;
import com.propify.challenge.dto.PropertyRequestDto;
import org.springframework.stereotype.Component;

@Component
public class PropertyMapper {

	private AddressMapper addressMapper;

	public Property toProperty(PropertyRequestDto propertyRequestDto) {
		Property property = new Property(null, propertyRequestDto.getCreateTime(), PropertyType.CONDOMINIUM,
				propertyRequestDto.getRentPrice(), addressMapper.toAddress(propertyRequestDto.getAddress()),
				propertyRequestDto.getEmailAddress(), propertyRequestDto.getCode());
		return property;
	}
}
