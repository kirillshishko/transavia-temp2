package com.epam.mentoring.framework.entities;

public class FlightStaticFactory {

    public static Flight createFlight(String departureAirport, String destinationAirport, String departureDate, String returnDate, int adaultsNumber, int childrenNmber){
    Flight flight = new Flight();
        flight.setDepartureAirport(departureAirport);
        flight.setDestinationAirport(destinationAirport);
        flight.setDepartureDate(departureDate);
        flight.setReturnDate(returnDate);
        flight.setAdaultsNumber(adaultsNumber);
        flight.setChildrenNumber(childrenNmber);

        return flight;
    }
}
