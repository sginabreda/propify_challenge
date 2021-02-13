package com.propify.challenge.service;

import com.propify.challenge.mapper.AddressDatabaseMapper;
import com.propify.challenge.domain.Property;
import com.propify.challenge.mapper.PropertyDatabaseMapper;
import com.propify.challenge.domain.PropertyReport;
import org.springframework.stereotype.Service;

import java.util.Collection;

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
        propertyDatabaseMapper.insert(property);
        System.out.println("CREATED: " + property.getId());
    }

    public void update(int id, Property property) {
        propertyDatabaseMapper.update(property);
        System.out.println("UPDATED: " + property.getId());
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

        // Calculate total quantity
        // propertyReport.totalQuantity =

        // Calculate the quantity of each type, 0 if there is no properties.
        // propertyReport.quantityPerType =

        // Calculate the average rent price (exclude the properties without rent price or with rent price = 0)
        // propertyReport.averageRentPrice =

        // Calculate the quantity of properties in the state of Illinois (IL)
        // propertyReport.illinoisQuantity =

        return propertyReport;
    }
}
