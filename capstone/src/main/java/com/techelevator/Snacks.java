package com.techelevator;

public abstract class Snacks {

    public String name;
    public String price;
    public String code;
    public String type;
    private int remainingSnacks = 5;

    public Snacks(String name, String code, String price, String type) {
        this.name = name;
        this.code = code;
        this.price = String.valueOf(price);
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

    public String getPrice() {
        return price;
    }

    public int getRemainingSnacks() {
        return remainingSnacks;
    }


}

