package me.humenius.fowler.prices;

public enum PriceCode {
    CHILDREN(2), REGULAR(0), NEW_RELEASE(1);

    private final int value;

    PriceCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
