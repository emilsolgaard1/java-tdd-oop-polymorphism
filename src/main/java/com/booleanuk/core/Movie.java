package com.booleanuk.core;

public class Movie implements IItem {
    String name;
    int price;

    public Movie(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
