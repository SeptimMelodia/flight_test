package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Flight> flights = FlightBuilder.createFlights();
        List<Filter> filters = new ArrayList<>();
        filters.add(new FilterDepartureUntilNow());
        filters.add(new FilterArrivalBeforeDeparture());
        filters.add(new FilterTimeBetweenSegments(2));

        Filter filterDepartureUntilNow = new FilterDepartureUntilNow();
        System.out.println("Departure until now filter: \n" + filterDepartureUntilNow.filter(flights));

        Filter filterArrivalBeforeDeparture = new FilterArrivalBeforeDeparture();
        System.out.println("Arrival Before Departure filter: \n" + filterArrivalBeforeDeparture.filter(flights));

        Filter filterTimeBetweenSegments = new FilterTimeBetweenSegments(2);
        System.out.println("Time Between Segments filter: \n" + filterTimeBetweenSegments.filter(flights));

        Filter andFilters = new AndFilters(filters);
        System.out.println("Departure until now filter: \n" + andFilters.filter(flights));

    }
}
