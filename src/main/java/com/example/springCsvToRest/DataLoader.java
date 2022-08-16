package com.example.springCsvToRest;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.io.FileReader;


@Component
public class DataLoader {

    private final BusinessPlaceRepository repository;

    public DataLoader(BusinessPlaceRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void loadData() {
        try {
            new CsvToBeanBuilder<BusinessPlace>(new FileReader("src/main/resources/DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv"))
                    .withType(BusinessPlace.class)
                    .withSeparator(';')
                    .build()
                    .parse()
                    .forEach(repository::save);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
