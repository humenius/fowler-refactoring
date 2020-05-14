package me.humenius.fowler.prices;

public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return PriceCode.REGULAR.getValue();
    }

    @Override
    public double getCharge(int daysRented) {
        double total = 2.0;

        if (daysRented > 2) {
            total += (daysRented - 2) * 1.5;
        }

        return total;
    }
}
