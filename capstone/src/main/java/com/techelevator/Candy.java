package com.techelevator;

public class Candy extends Snacks{
    public Candy(String code, String name, String price, String type) {
        super(code, name, String.valueOf(price), type);
        this.code = code;
        this.name = name;
        this.price = String.valueOf(price);
        this.type = type;
    }

    @Override
    public String print() {
        return "Munch Munch, Yum!";
    }
}
