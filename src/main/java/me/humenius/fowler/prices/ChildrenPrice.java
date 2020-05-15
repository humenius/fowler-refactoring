package me.humenius.fowler.prices;

public class ChildrenPrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        double total = 1.5;

        if (daysRented > 3) {
            total += (daysRented - 3) * 1.5;
        }

        return total;
    }
}
