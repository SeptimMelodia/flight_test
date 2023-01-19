package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDepartureUntilNow implements Filter{

    private final List<Flight> flights;

    public FilterDepartureUntilNow(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public List<Flight> filter() {
        return flights.stream()
                .filter(flight -> flight.getSegments().stream()
                        .anyMatch(segment -> segment.getDepartureDate().isAfter(LocalDateTime.now())))
                .collect(Collectors.toList());
    }
}
