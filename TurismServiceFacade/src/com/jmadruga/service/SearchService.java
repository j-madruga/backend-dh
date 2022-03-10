package com.jmadruga.service;

import com.jmadruga.controllers.ApiFlight;
import com.jmadruga.controllers.ApiHotel;
import com.jmadruga.models.Flight;
import com.jmadruga.models.Hotel;

public class SearchService implements ISearchService {

    private ApiFlight apiFlight;
    private ApiHotel apiHotel;

    public SearchService() {
        apiFlight = new ApiFlight();
        apiHotel = new ApiHotel();
    }

    @Override
    public String searchHotelAndFlight(Integer year, Integer month, Integer dayOfMonth, String city) {
        String result = "no se encuentran vuelos y hoteles en esa fecha y ciudad";
        try {
            Flight foundFlight = apiFlight.searchFlight(year, month, dayOfMonth, city);
            Hotel foundHotel = apiHotel.searchHotel(city);
            if (foundFlight.getDestinationCity().equalsIgnoreCase(foundHotel.getCity())) {
                result = "Vuelo encontrado: parte el dia " + foundFlight.getDepartureDate() + ", Destino "
                        + foundFlight.getDestinationCity() + "\n"
                        + "Hotel encontrado: " + foundHotel.getName() + " en la ciudad de " + foundHotel.getCity();
            }
            System.out.println(result);
        } catch (Exception e) {
            e.getMessage();
        }
        return result;
    }
}
