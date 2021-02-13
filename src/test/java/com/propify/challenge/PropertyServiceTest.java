package com.propify.challenge;

import com.propify.challenge.mapper.AddressDatabaseMapper;
import com.propify.challenge.mapper.PropertyDatabaseMapper;
import com.propify.challenge.service.AlertService;
import com.propify.challenge.service.PropertyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PropertyServiceTest {

    PropertyService propertyService;

    PropertyDatabaseMapper propertyDatabaseMapper;

    AddressDatabaseMapper addressDatabaseMapper;

    AlertService alertService;

    // TODO: add at least 3 tests to the method propertyService.propertyReport()
    @Test
    public void testPropertyReport() {

    }

}
