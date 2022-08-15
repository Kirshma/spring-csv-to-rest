package com.example.springCsvToRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/betriebsstelle")
public class BusinessPlaceController {

    private final BusinessPlaceRepository repository;

    public BusinessPlaceController(BusinessPlaceRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<BusinessPlace> getPlacesOfBusiness() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<BusinessPlace>> getPlaceOfBusinessById(@PathVariable String id) {
        Optional<BusinessPlace> result = repository.findByIdIgnoreCase(id);
        return result.isEmpty() ? new ResponseEntity<>(result,HttpStatus.NOT_FOUND) : new ResponseEntity<>(result, HttpStatus.OK);
    }

}
