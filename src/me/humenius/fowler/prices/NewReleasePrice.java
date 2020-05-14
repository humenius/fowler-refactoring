package me.humenius.fowler.prices;

public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return PriceCode.NEW_RELEASE.getValue();
    }

    @Override
    public double getCharge(int daysRented) {
        return (daysRented * 3);
    }
}
