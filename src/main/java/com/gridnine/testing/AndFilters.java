package com.gridnine.testing;

import java.util.ArrayList;
import java.util.List;

public class AndFilters implements Filter{

    private final List<Filter> filters;

    public AndFilters(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public List<Flight> filter(List<Flight> flights) {

        List<Flight> filteredFlights = new ArrayList<>(flights);

        for (Filter filter: filters) {
            filteredFlights = filter.filter(filteredFlights);
        }
        return filteredFlights;
    }
}
