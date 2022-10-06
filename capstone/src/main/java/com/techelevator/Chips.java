package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Snacks{
    public Chips(String name, String location, BigDecimal price) {
        super(name, location, price);
    }

    @Override
    public String print() {
        return "Crunch Crunch, Yum!";
    }
}
