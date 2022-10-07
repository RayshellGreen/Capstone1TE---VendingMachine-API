package com.techelevator;

import java.math.BigDecimal;

public class Finance {

/** Once user selects exit all vending balance will be dispensed
 */
    private BigDecimal vendingBalance = new BigDecimal("0.00");

    public Finance() {

    }


    public void setVendingBalance(BigDecimal vendingBalance) {
        this.vendingBalance = vendingBalance;
    }

    public BigDecimal getVendingBalance() {
        return vendingBalance;
    }

//    public Finance(BigDecimal vendingBalance) {
//
//        this.vendingBalance = vendingBalance;
//
//    }
    public BigDecimal insertMoney(String moneyInserted) {
        BigDecimal moneyBd = new BigDecimal(moneyInserted);
        vendingBalance = vendingBalance.add(moneyBd);
        return vendingBalance;
    }

    public BigDecimal spendMoney(BigDecimal moneySpent) {
        vendingBalance = vendingBalance.subtract(moneySpent);
        return vendingBalance;
    }

    
    //public BigDecimal addingToBalance(BigDecimal vendingBalance) {
        
       // feedMoney += vendingBalance
        
   // }
    
    //make sure users are putting in whole numbers, make it boolean for whole number clarification
    // change things to BigDecimal 
    // Keep it as simple as possible 



}
