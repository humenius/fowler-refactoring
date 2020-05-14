package me.humenius.fowler;

import me.humenius.fowler.prices.Price;

public class Movie extends Price {
    private final String title;
    private final Price price;

    Movie(String title, Price price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }
}