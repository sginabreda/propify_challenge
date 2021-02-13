package com.propify.challenge.mapper;

import com.propify.challenge.domain.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface AddressMapper {

    void insert(Address address);

    Set<Address> search();

    Address findById(Integer id);
}
