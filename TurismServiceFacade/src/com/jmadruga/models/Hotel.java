package com.jmadruga.models;

import java.time.LocalDate;

public class Hotel {
    private String name;
    private String city;

    public Hotel(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
