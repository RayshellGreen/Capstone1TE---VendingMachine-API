package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Snacks{
    public Candy(String name, String location, BigDecimal price) {
        super(name, location, price);
    }

    @Override
    public String print() {
        return "Munch Munch, Yum!";
    }
}
