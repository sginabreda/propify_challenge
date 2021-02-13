package com.propify.challenge.newmapper;

import com.propify.challenge.domain.Property;
import com.propify.challenge.domain.PropertyType;
import com.propify.challenge.dto.PropertyRequestDto;
import org.springframework.stereotype.Component;

@Component
public class PropertyMapper {

	public Property toProperty(PropertyRequestDto propertyRequestDto) {
		Property property = new Property(null, propertyRequestDto.getCreateTime(), PropertyType.CONDOMINIUM,
				propertyRequestDto.getRentPrice(), propertyRequestDto.getAddress(),
				propertyRequestDto.getEmailAddress(), propertyRequestDto.getCode());
		return property;
	}
}
