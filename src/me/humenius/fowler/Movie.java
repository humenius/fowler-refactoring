package me.humenius.fowler;

public class Movie implements Price {
    private final String title;
    private final PriceCode priceCode;

    Movie(String title, PriceCode priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public PriceCode getPriceCode() {
        return priceCode;
    }

    @Override
    public double getCharge() {
        return 0;
    }

    @Override
    public int getFrequentRenterPoints() {
        return 0;
    }
}