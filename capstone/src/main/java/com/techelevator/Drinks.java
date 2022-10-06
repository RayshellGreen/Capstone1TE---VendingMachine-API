package com.techelevator;

import java.math.BigDecimal;

public class Drinks extends Snacks{
    public Drinks(String name, String location, BigDecimal price) {
        super(name, location, price);
    }

    @Override
    public String print() {
        return "Glug Glug, Yum!";
    }
}
