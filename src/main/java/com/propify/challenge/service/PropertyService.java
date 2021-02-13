package com.propify.challenge.service;

import com.propify.challenge.domain.PropertyType;
import com.propify.challenge.mapper.AddressDatabaseMapper;
import com.propify.challenge.domain.Property;
import com.propify.challenge.mapper.PropertyDatabaseMapper;
import com.propify.challenge.domain.PropertyReport;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PropertyService {

    PropertyDatabaseMapper propertyDatabaseMapper;

    AddressDatabaseMapper addressDatabaseMapper;

    AlertService alertService;

    public Collection<Property> search(String minRentPrice, String maxRentPrice) {
        return propertyDatabaseMapper.search(minRentPrice, maxRentPrice);
    }

    public Property findById(int id) {
        return propertyDatabaseMapper.findById(id);
    }

    public void insert(Property property) {
        addressDatabaseMapper.insert(property.getAddress());
        propertyDatabaseMapper.insert(property);
    }

    public void update(int id, Property property) {
        propertyDatabaseMapper.update(id, property);
    }

    public void delete(int id) {
        propertyDatabaseMapper.delete(id);
        System.out.println("DELETED: " + id);

        alertService.sendPropertyDeletedAlert(id);
        // TODO: Sending the alert should be non-blocking (asynchronous)
        //  Extra points for only sending the alert when/if the transaction is committed
    }

    public PropertyReport propertyReport() {
        var allProperties = propertyDatabaseMapper.search(null, null);
        var propertyReport = new PropertyReport();
        Map<PropertyType, Integer> quantities = new HashMap<>() {{
            put(PropertyType.CONDOMINIUM, 0);
            put(PropertyType.MULTI_FAMILY, 0);
            put(PropertyType.SINGLE_FAMILY, 0);
            put(PropertyType.TOWNHOUSE, 0);
        }};
        double rentPricesSummed = 0L;
        int propertiesWithRent = 0;
        int illinoisQuantity = 0;

        // Calculate total quantity
        propertyReport.setTotalQuantity(allProperties.size());

        // Calculate the quantity of each type, 0 if there is no properties.
        for (Property p : allProperties) {
            quantities.put(p.getType(), quantities.get(p.getType()) + 1);
            if (p.getRentPrice() > 0)  {
                rentPricesSummed+=p.getRentPrice();
                propertiesWithRent++;
            }
            if (p.getAddress().getState().equals("IL")) illinoisQuantity++;
        }
        propertyReport.setQuantityPerType(quantities);

        // Calculate the average rent price (exclude the properties without rent price or with rent price = 0)
        propertyReport.setAverageRentPrice(allProperties.size() > 0 ? rentPricesSummed / propertiesWithRent : 0);

        // Calculate the quantity of properties in the state of Illinois (IL)
        propertyReport.setIllinoisQuantity(illinoisQuantity);

        return propertyReport;
    }
}
