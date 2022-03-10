package com.jmadruga.service;

import java.time.LocalDate;

public interface ISearchService {
    public String searchHotelAndFlight(Integer year, Integer month, Integer dayOfMonth, String city);
}
