package com.epam.mentoring.framework.entities;

public class Flight {
    protected String departureAirport;
    protected String destinationAirport;
    protected String departureDate;
    protected String returnDate;
    protected String budget;
    protected String bookingNumber;
    protected String lastname;
    protected int adaultsNumber;
    protected int cheldrenNumber;

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAdaultsNumber() {
        return adaultsNumber;
    }

    public void setAdaultsNumber(int adaultsNumber) {
        this.adaultsNumber = adaultsNumber;
    }

    public int getCheldrenNumber() {
        return cheldrenNumber;
    }

    public void setChildrenNumber(int cheldrenNumber) {
        this.cheldrenNumber = cheldrenNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (getAdaultsNumber() != flight.getAdaultsNumber()) return false;
        if (getCheldrenNumber() != flight.getCheldrenNumber()) return false;
        if (getDepartureAirport() != null ? !getDepartureAirport().equals(flight.getDepartureAirport()) : flight.getDepartureAirport() != null)
            return false;
        if (getDestinationAirport() != null ? !getDestinationAirport().equals(flight.getDestinationAirport()) : flight.getDestinationAirport() != null)
            return false;
        if (getDepartureDate() != null ? !getDepartureDate().equals(flight.getDepartureDate()) : flight.getDepartureDate() != null)
            return false;
        if (getReturnDate() != null ? !getReturnDate().equals(flight.getReturnDate()) : flight.getReturnDate() != null)
            return false;
        if (getBudget() != null ? !getBudget().equals(flight.getBudget()) : flight.getBudget() != null) return false;
        if (getBookingNumber() != null ? !getBookingNumber().equals(flight.getBookingNumber()) : flight.getBookingNumber() != null)
            return false;
        return getLastname() != null ? getLastname().equals(flight.getLastname()) : flight.getLastname() == null;

    }

    @Override
    public int hashCode() {
        int result = getDepartureAirport() != null ? getDepartureAirport().hashCode() : 0;
        result = 31 * result + (getDestinationAirport() != null ? getDestinationAirport().hashCode() : 0);
        result = 31 * result + (getDepartureDate() != null ? getDepartureDate().hashCode() : 0);
        result = 31 * result + (getReturnDate() != null ? getReturnDate().hashCode() : 0);
        result = 31 * result + (getBudget() != null ? getBudget().hashCode() : 0);
        result = 31 * result + (getBookingNumber() != null ? getBookingNumber().hashCode() : 0);
        result = 31 * result + (getLastname() != null ? getLastname().hashCode() : 0);
        result = 31 * result + getAdaultsNumber();
        result = 31 * result + getCheldrenNumber();
        return result;
    }
}
