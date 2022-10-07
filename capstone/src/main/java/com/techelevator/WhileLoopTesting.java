package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class WhileLoopTesting {
    private BigDecimal vendingBalance;

    public static void main(String[] args) {

        Finance moneyMethod = new Finance();

        int mainMenuSelection = 0;

            Scanner userInput = new Scanner(System.in);
            mainMenuSelection = Integer.parseInt(userInput.nextLine());
            System.out.println("(1) Display Vending Machine Items \n(2) Purchase Menu \n(3) Exit");

            do {
                InventoryFile inventory = new InventoryFile();
                System.out.println(inventory.getInventory());
                System.out.println("(2) Purchase Menu \n(3) Exit");
                
            } while (mainMenuSelection == 1);

            do {
                System.out.println("(4) Feed Money \n(5) Select Product \n(6) Finish Transaction");
                mainMenuSelection = Integer.parseInt(userInput.nextLine());

            }
            while (mainMenuSelection == 2);


//    public BigDecimal getVendingBalance() {
//        return vendingBalance;
//    }



    }

}