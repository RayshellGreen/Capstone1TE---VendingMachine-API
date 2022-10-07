package com.techelevator;

public class Finance {

/** Once user selects exit all vending balance will be dispensed
 */
    private int vendingBalance ;
    private int feedMoney;
    private int spentMoney;


    public void setSpentMoney(int spentMoney) {
        this.spentMoney = spentMoney;
    }

    public void setFeedMoney(int feedMoney) {
        this.feedMoney = feedMoney;
    }

    public void setVendingBalance(int vendingBalance) {
        this.vendingBalance = vendingBalance;
    }

    public int getSpentMoney() {
        return spentMoney;
    }

    public int getFeedMoney() {
        return feedMoney;
    }

    public int getVendingBalance() {
        return vendingBalance;
    }

    public Finance(int vendingBalance, int feedMoney) {

        this.feedMoney = feedMoney;
        this.vendingBalance = vendingBalance;

        feedMoney += vendingBalance;
        vendingBalance -= spentMoney;

    }



}
