package me.humenius.fowler;

public interface Price {
    double getCharge();

    int getFrequentRenterPoints();

    static double amountFor(Rental rental) {
        double total = 0;
        switch (rental.getMovie()
                      .getPriceCode()) {
        case REGULAR:
            total += 2;
            if (rental.getDaysRented() > 2) {
                total += (rental.getDaysRented() - 2) * 1.5;
            }
            break;
        case NEW_RELEASE:
            total += rental.getDaysRented() * 3;
            break;
        case CHILDREN:
            total += 1.5;
            if (rental.getDaysRented() > 3) {
                total += (rental.getDaysRented() - 3) * 1.5;
            }
            break;
        }
        return total;
    }
}