package com.propify.challenge.mapper;

import com.propify.challenge.domain.Property;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface PropertyDatabaseMapper {

    public void insert(Property property);

    public Set<Property> search(String minRentPrice, String maxRentPrice);

    public Property findById(Integer id);

    public void update(Property property);

    public void delete(Integer id);
}