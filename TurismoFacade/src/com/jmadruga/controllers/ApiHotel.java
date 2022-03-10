package com.jmadruga.controllers;

import com.jmadruga.models.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApiHotel {
    private List<Hotel> hotelList = new ArrayList<>();

    public ApiHotel() {
        Hotel hotel1 = new Hotel("BA Grand Hotel", "Buenos Aires");
        Hotel hotel2 = new Hotel("Sheraton Madrid","Madrid");
        Hotel hotel3 = new Hotel("Mont Blanc","Paris");
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
    }

    public void addToList(Hotel h){
        this.hotelList.add(h);
    }

    public Hotel searchHotel(String city) {
        List<Hotel> foundHotel = hotelList.stream()
                .filter(hotel -> hotel.getCity().equals(city))
                .collect(Collectors.toList());
        return foundHotel.get(0);
    }
}
