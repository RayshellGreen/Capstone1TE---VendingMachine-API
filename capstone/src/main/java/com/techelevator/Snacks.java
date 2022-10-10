package com.techelevator;

import java.math.BigDecimal;

public abstract class Snacks {

    public String name;
    public BigDecimal price;
    public String code;
    public String type;
    private int remainingSnacks = 5;

    public Snacks(String name, String code, BigDecimal price, String type) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.type = type;
    }

    public abstract String print();
    //GETTERS

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getRemainingSnacks() {
        return remainingSnacks;
    }


}

