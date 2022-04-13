package com.example.emtbackend.service.impl;

import com.example.emtbackend.model.Country;
import com.example.emtbackend.model.exceptions.CountryNotFoundException;
import com.example.emtbackend.repository.CountryRepository;
import com.example.emtbackend.service.CountryService;

public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country findById(Long id) {
        return this.countryRepository.findById(id).orElseThrow(() -> new CountryNotFoundException(id));
    }

    @Override
    public Country create(Country country) {
        return this.countryRepository.save(country);
    }
}
