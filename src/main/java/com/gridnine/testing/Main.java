package com.gridnine.testing;

public class Main {

    public static void main(String[] args) {
        FilterDepartureUntilNow filterDepartureUntilNow = new FilterDepartureUntilNow(FlightBuilder.createFlights());
        System.out.println(filterDepartureUntilNow.filter());
    }
}
