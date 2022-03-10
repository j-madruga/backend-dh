package com.jmadruga.models;

import java.time.LocalDate;
import java.time.Month;

public class Flight {
    private LocalDate departureDate;
    private String destinationCity;

    public Flight(Integer year, Integer month, Integer dayOfMonth, String destinationCity) {
        this.departureDate = LocalDate.of(year, month, dayOfMonth);
        this.destinationCity = destinationCity;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public String getDestinationCity() {
        return destinationCity;
    }
}
