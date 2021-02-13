package com.propify.challenge.mapper;

import com.propify.challenge.domain.Property;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface PropertyDatabaseMapper {

    void insert(Property property);

    Set<Property> search(String minRentPrice, String maxRentPrice);

    Property findById(Integer id);

    void update(int id, Property property);

    void delete(Integer id);
}
