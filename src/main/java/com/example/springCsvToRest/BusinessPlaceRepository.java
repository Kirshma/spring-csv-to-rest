package com.example.springCsvToRest;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BusinessPlaceRepository extends CrudRepository<BusinessPlace, String> {

    public Optional<BusinessPlace> findByIdIgnoreCase(String id);

}
