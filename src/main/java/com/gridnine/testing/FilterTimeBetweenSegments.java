package com.gridnine.testing;

import java.util.List;

public class FilterTimeBetweenSegments implements Filter{

    private final List<Flight> flights;

    public FilterTimeBetweenSegments(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public List<Flight> filter() {
        return null;
    }
}
