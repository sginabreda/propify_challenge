package com.propify.challenge.mapper;

import com.propify.challenge.domain.PropertyType;
import com.propify.challenge.domain.Property;
import com.propify.challenge.dto.PropertyDto;
import com.propify.challenge.dto.PropertyRequestDto;
import org.springframework.stereotype.Component;

@Component
public class PropertyMapper {

	private AddressMapper addressMapper;

	public Property toProperty(PropertyRequestDto propertyRequestDto) {
		return new Property(null, propertyRequestDto.getCreateTime(), PropertyType.valueOf(propertyRequestDto.getType()),
				propertyRequestDto.getRentPrice(), addressMapper.toAddress(propertyRequestDto.getAddress()),
				propertyRequestDto.getEmailAddress(), propertyRequestDto.getCode());
	}

	public PropertyDto toPropertyDto(Property property) {
		return new PropertyDto(property.getId(), property.getCreateTime(), property.getType().toString(),
				property.getRentPrice(), addressMapper.toAddressDto(property.getAddress()), property.getEmailAddress(),
				property.getCode());
	}
}
