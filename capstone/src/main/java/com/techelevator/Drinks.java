package com.techelevator;

import java.math.BigDecimal;

public class Drinks extends Snacks{
    public Drinks(String name, String code, BigDecimal price, String type) {
        super(name, code, String.valueOf(price), type);
        this.name = name;
        this.code = code;
        this.price = String.valueOf(price);
        this.type = type;
    }

    @Override
    public String print() {
        return "Glug Glug, Yum!";
    }
}
