package com.techelevator;

public class Chips extends Snacks{


    public Chips(String code, String name, String price, String type) {
        super(name, code, String.valueOf(price), type);
        this.name = name;
        this.code = code;
        this.price = String.valueOf(price);
        this.type = type;
    }

    @Override
    public String print() {
        return "Crunch Crunch, Yum!";
    }
}
