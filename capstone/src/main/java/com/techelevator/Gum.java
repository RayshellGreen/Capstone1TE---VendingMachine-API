package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Snacks{
    public Gum(String name, String location, BigDecimal price) {
        super(name, location, price);
    }

    @Override
    public String print() {
        return "Chew Chew, Yum!";
    }
}
