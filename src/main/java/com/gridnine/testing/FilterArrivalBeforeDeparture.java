package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.List;

public class FilterArrivalBeforeDeparture implements Filter{

    private final List<Flight> flights;

    public FilterArrivalBeforeDeparture(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public List<Flight> filter() {
        return flights;
    }
}
