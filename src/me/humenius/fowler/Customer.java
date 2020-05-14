package me.humenius.fowler;

import java.lang.*;
import java.util.*;

class Customer {
    private final String name;
    private List<Rental> rentals = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String getStatement() {
        StringBuilder statement = new StringBuilder();
        statement.append("Rental Record for ")
                 .append(getName())
                 .append("\n\t")
                 .append("Title")
                 .append("\t\t")
                 .append("Days")
                 .append('\t')
                 .append("Amount")
                 .append('\n');

        for (Rental rental : rentals) {
            statement.append('\t')
                     .append(rental.getMovie()
                                   .getTitle())
                     .append('\t')
                     .append('\t')
                     .append(rental.getDaysRented())
                     .append('\t')
                     .append('\t')
                     .append(rental.getCharge())
                     .append('\n');
        }

        statement.append("Amount owed is ")
                 .append(getTotalCharge())
                 .append('\n')
                 .append("You earned ")
                 .append(getTotalFrequentRenterPoints())
                 .append(" frequent renter points");

        return statement.toString();
    }

    private double getTotalCharge() {
        double total = 0.0;

        for (Rental rental : rentals) {
            total += rental.getCharge();
        }

        return total;
    }

    private int getTotalFrequentRenterPoints() {
        int total = 0;

        for (Rental rental : rentals) {
            total += rental.getFrequentRenterPoints();
        }

        return total;
    }
}
    