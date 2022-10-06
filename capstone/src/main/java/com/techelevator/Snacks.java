package com.techelevator;

import java.math.BigDecimal;

public abstract class Snacks {

    private String name;
    private BigDecimal price;
    private String location;
    private int remainingSnacks = 5;

    public Snacks(String name, String location, BigDecimal price) {
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public abstract String print();
    //GETTERS

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getRemainingSnacks() {
        return remainingSnacks;
    }


}

