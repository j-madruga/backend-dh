package com.jmadruga.test;

import com.jmadruga.service.SearchService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchServiceTest {
    @Test
    public void searchServiceTest_shouldReturnAStringWithFlightAndHotelInfo() {
        // Arrange
        SearchService subjectTest = new SearchService();
        // Act
        String expectedResult = "Vuelo encontrado: parte el dia 2022-12-25, Destino Madrid"
                + "\n"
                + "Hotel encontrado: Sheraton Madrid en la ciudad de Madrid";
        String result = subjectTest.searchHotelAndFlight(2022, 12, 25, "Madrid");
        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void searchServiceTest_shouldReturnAStringWithErrorMessage() {
        // Arrange
        SearchService subjectTest = new SearchService();
        // Act
        String expectedResult = "Vuelo encontrado: parte el dia 2022-12-25, Destino Madrid"
                + "\n"
                + "Hotel encontrado: Sheraton Madrid en la ciudad de Madrid";
        String result = subjectTest.searchHotelAndFlight(2022, 12, 25, "Paris");
        // Assert
        Assertions.assertNotEquals(expectedResult, result);
    }
}
