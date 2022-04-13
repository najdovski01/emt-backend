package com.example.emtbackend.service;

import com.example.emtbackend.model.Country;

public interface CountryService {
    Country findById(Long id);
    Country create(Country country);
}
