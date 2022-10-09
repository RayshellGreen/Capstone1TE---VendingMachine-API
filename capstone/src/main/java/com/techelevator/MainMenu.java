package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainMenu {


    private BigDecimal vendingBalance;

    public static void main(String[] args) {

        Finance moneyMethod = new Finance();


        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("(1) Display Vending Machine Items \n(2) Purchase \n(3) Exit");
            int mainMenuSelection = Integer.parseInt(userInput.nextLine());


            int backToMainMenu = 0;
            if (mainMenuSelection == 1) {
                System.out.println("Potato Crisps \nStackers \nGrain Waves \nCloud Popcorn \nMoonpie \nCowtales \nWonka Bar \nCrunchie \nCola \nDr. Salt \nMountain Melter \nHeavy \nU-Chews \nLittle League Chew \nChiclets \nTriplemint");
                System.out.println("(1) Back to Main Menu");
                backToMainMenu = Integer.parseInt(userInput.nextLine());
                if (backToMainMenu == 1) {
                    System.out.println("(1) Display Vending Machine Items \n(2) Purchase \n(3) Exit");
                    backToMainMenu = Integer.parseInt(userInput.nextLine());
                } else if (mainMenuSelection == 2) {
                    System.out.println("(4) Feed Money \n(5) Select Product \n(6) Finish Transaction");
                    int purchaseMenuReader = Integer.parseInt((userInput.nextLine()));
                    if (purchaseMenuReader == 4) {
                        //purchase meanu reader .split (\\|
                        System.out.println("Please insert total money");
//                    String billReader = userInput.nextLine();
                        // this line turns String into a BigDecimal
                        moneyMethod.insertMoney(userInput.nextLine());
                        System.out.printf("Balance: %s\n", moneyMethod.getVendingBalance()); // Balance prints BillReaders Big Decimal
                        System.out.println("(4) Feed Money \n(5) Select Product \n(6) Finish Transaction");
                        purchaseMenuReader = Integer.parseInt(userInput.nextLine());
                        if (purchaseMenuReader == 4) {
                            System.out.println("Please insert total money");
//                    String billReader = userInput.nextLine();
                            // this line turns String into a BigDecimal
                            moneyMethod.insertMoney(userInput.nextLine());
                            System.out.printf("Balance: %s\n", moneyMethod.getVendingBalance()); // Balance prints BillReaders Big Decimal
                            System.out.println("(4) Feed Money \n(5) Select Product \n(6) Finish Transaction");
                        }
                        purchaseMenuReader = Integer.parseInt(userInput.nextLine());
                        if (purchaseMenuReader == 4) {
                            System.out.println("Please insert total money");
//                    String billReader = userInput.nextLine();
                            // this line turns String into a BigDecimal
                            moneyMethod.insertMoney(userInput.nextLine());
                            System.out.printf("Balance: %s\n", moneyMethod.getVendingBalance()); // Balance prints BillReaders Big Decimal
                            System.out.println("(4) Feed Money \n(5) Select Product \n(6) Finish Transaction");
                        }
                        purchaseMenuReader = Integer.parseInt(userInput.nextLine());
                        if (purchaseMenuReader == 4) {
                            System.out.println("Please insert total money");
//                    String billReader = userInput.nextLine();
                            // this line turns String into a BigDecimal
                            moneyMethod.insertMoney(userInput.nextLine());
                            System.out.printf("Balance: %s\n", moneyMethod.getVendingBalance()); // Balance prints BillReaders Big Decimal
                            System.out.println("(5) Select Product \n(6) Finish Transaction");
                        } else if (purchaseMenuReader == 5) {
                            InventoryFile inventory = new InventoryFile();
                            System.out.println(inventory.getInventory()); //can only read the file once, need to access the data structure set up in inventory file
                            System.out.println("Please select a product");
                            purchaseMenuReader = Integer.parseInt(userInput.nextLine()); // inventory index caliin using position

                        }

                        //billReaderDecimal = feedMoney       feedMoney + vendingBalance
                        //once you finish a process you can call another method within a method.
                        // method call out per slection will allow you to request userinput multiple times


                    }
                    //BigDecimal billReader = BigDecimal.valueOf(0);


                }
                if (mainMenuSelection == 3 || backToMainMenu == 3) {
                    System.out.println("Transaction Finished");
                }


            }
        } catch(NumberFormatException e){
            System.out.println("Please enter a number 1, 2 or 3");
        }

//    public BigDecimal getVendingBalance() {
//        return vendingBalance;
//    }


    }
}
