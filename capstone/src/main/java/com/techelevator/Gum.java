package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Snacks{
    public Gum(String code, String name, BigDecimal price, String type) {

        super(code, name, String.valueOf(price), type);
        this.code = code;
        this.name = name;
        this.price = String.valueOf(price);
        this.type = type;
    }

    @Override
    public String print() {
        return "Chew Chew, Yum!";
    }
}
