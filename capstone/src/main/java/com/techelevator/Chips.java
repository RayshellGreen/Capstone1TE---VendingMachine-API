package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Snacks{


    public Chips(String code, String name, BigDecimal price, String type) {
        super(name, code, price, type);
        this.name = name;
        this.code = code;
        this.price = price;
        this.type = type;
    }

    @Override
    public String print() {
        return "Crunch Crunch, Yum!";
    }
}
