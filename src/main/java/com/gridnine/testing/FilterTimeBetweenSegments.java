package com.gridnine.testing;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filters by time on earth passed to the constructor
 */

public class FilterTimeBetweenSegments implements Filter{
    private final long hour;

    public FilterTimeBetweenSegments(Integer hour) {
        this.hour = hour;
    }

    @Override
    public List<Flight> filter(List<Flight> flights) {
        return flights.stream()
                .filter(flight -> {
                    List<Segment> segments = flight.getSegments();
                    long difference = 0;

                    for (int i = 1; i < segments.size(); i++) {
                        difference = Duration.between(segments.get(i).getDepartureDate(), segments.get(i - 1).getArrivalDate())
                                .abs().toHours();
                    }
                    return difference < hour;
                }).collect(Collectors.toList());
    }
}
