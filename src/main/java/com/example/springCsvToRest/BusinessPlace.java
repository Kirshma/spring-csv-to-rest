package com.example.springCsvToRest;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "betriebsstelle")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BusinessPlace {
    //maybe: locale = "de-DE"

    @CsvBindByName(column = "PLC")
    private String plc;
    @Id
    @NonNull
    @CsvBindByName(column = "RL100-Code", required = true)
    private String id;
    @CsvBindByName(column = "RL100-Langname", required = true)
    private String longName;
    @CsvBindByName(column = "RL100-Kurzname", required = true)
    private String shortName;
    @CsvBindByName(column = "Typ Kurz")
    private String shortType;
    @CsvBindByName(column = "Typ Lang", required = true)
    private String longType;
    @CsvBindByName(column = "Betriebszustand")
    private String operationalStatus;
    @CsvBindByName(column = "Datum ab")
    private String dateFrom;
    @CsvBindByName(column = "Datum bis")
    private String dateTo;
    @CsvBindByName(column = "Niederlassung", required = true)
    private int branchOffice;
    @CsvBindByName(column = "Regionalbereich", required = true)
    private String region;
    @CsvBindByName(column = "Letzte Änderung", required = true)
    private String lastChange;



}
