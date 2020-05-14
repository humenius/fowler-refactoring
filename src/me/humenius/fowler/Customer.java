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
/*    public String getStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) enum_rentals.nextElement();
            //determine amounts for each line
            thisAmount = amountFor(each);
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie()
                     .getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            //show figures for this rental
            result += "\t" + each.getMovie()
                                 .getTitle() + "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }*/

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
    