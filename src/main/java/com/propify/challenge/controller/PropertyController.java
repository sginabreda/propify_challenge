package com.propify.challenge.controller;

import com.propify.challenge.domain.Property;
import com.propify.challenge.domain.PropertyReport;
import com.propify.challenge.service.PropertyService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "/properties",
                produces = {"application/json"})
public class PropertyController {

    PropertyService propertyService;

    // API endpoints for CRUD operations on entities of type Property
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Collection<Property> search(String minRentPrice, String maxRentPrice) {
        return propertyService.search(minRentPrice, maxRentPrice);
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Property findById(@PathVariable int id) {
        return propertyService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(Property property) {
        // TODO: Property attributes must be validated
        propertyService.insert(property);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(Property property) {
        // TODO: Property attributes must be validated
        propertyService.update(property);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable int id) {
        propertyService.delete(id);
    }

    @GetMapping(value = "/report")
    @ResponseStatus(HttpStatus.OK)
    public PropertyReport report() {
        return propertyService.propertyReport();
    }
}
