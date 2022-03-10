package com.jmadruga.controllers;

import com.jmadruga.models.Flight;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApiFlight {
    private List<Flight> avaliableFlights = new ArrayList<>();

    public ApiFlight() {
        Flight flight1 = new Flight(2022, 12, 24, "Buenos Aires");
        Flight flight2 = new Flight(2022, 12, 25, "Madrid");
        Flight flight3 = new Flight(2022, 12, 26, "Paris");
        avaliableFlights.add(flight1);
        avaliableFlights.add(flight2);
        avaliableFlights.add(flight3);
    }

    public void addFlight(Flight f) {
        avaliableFlights.add(f);
    }

    public Flight searchFlight(Integer year, Integer month, Integer dayOfMonth, String city) {
        LocalDate departureDate = LocalDate.of(year, month, dayOfMonth);
        List<Flight> foundFlightList = avaliableFlights.stream()
                .filter(flight -> flight.getDepartureDate().equals(departureDate) && flight.getDestinationCity().equals(city))
                .collect(Collectors.toList());
        return foundFlightList.get(0);
    }
}
