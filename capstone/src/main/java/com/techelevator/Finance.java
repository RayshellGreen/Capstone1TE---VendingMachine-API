package com.techelevator;

import java.math.BigDecimal;

public class Finance {

/** Once user selects exit all vending balance will be dispensed
 */
    private BigDecimal vendingBalance ;
    private BigDecimal feedMoney;
    private BigDecimal spentMoney;


    public void setSpentMoney(BigDecimal spentMoney) {
        this.spentMoney = spentMoney;
    }

    public void setFeedMoney(BigDecimal feedMoney) {
        this.feedMoney = feedMoney;
    }

    public void setVendingBalance(BigDecimal vendingBalance) {
        this.vendingBalance = vendingBalance;
    }

    public BigDecimal getSpentMoney() {
        return spentMoney;
    }

    public BigDecimal getFeedMoney() {
        return feedMoney;
    }

    public BigDecimal getVendingBalance() {
        return vendingBalance;
    }

    public  void   Finance(BigDecimal vendingBalance, BigDecimal feedMoney, BigDecimal spentMoney) {

        this.feedMoney = feedMoney;
        this.vendingBalance = vendingBalance;
        this.spentMoney = spentMoney;

    }

    public BigDecimal void  Balance(BigDecimal amountSpent) {



    }

    //make sure users are putting in whole numbers, make it boolean for whole number clarification
    // change things to BigDecimal
    // Keep it as simple as possible



}
