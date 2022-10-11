package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainMenuTest extends Selection {

    private BigDecimal vendingBalance;

    public MainMenuTest(int itemPick) {
        super(itemPick);
    }


    public static void main(String[] args) {

        Finance moneyMethod = new Finance();
        ChangeGiven giveChange = new ChangeGiven();
        InventoryFile file = new InventoryFile();


//        InventoryFile file = new InventoryFile();
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("(1) Display Vending Machine Items \n(2) Purchase \n(3) Exit");
            int mainMenuSelection = Integer.parseInt(userInput.nextLine());


            int backToMainMenu = 0;
            if (mainMenuSelection == 1) {
                System.out.println(file.getInventory());
                System.out.println("(1) Back to Main Menu");
                backToMainMenu = Integer.parseInt(userInput.nextLine());
                if (backToMainMenu == 1) {
                    System.out.println("(1) Display Vending Machine Items \n(2) Purchase \n(3) Exit");
                    backToMainMenu = Integer.parseInt(userInput.nextLine());
                }
                if (backToMainMenu == 2) {
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

                    }
                    purchaseMenuReader = Integer.parseInt(userInput.nextLine());
                    if (purchaseMenuReader == 4) {
                        System.out.println("Please insert total money");
//                    String billReader = userInput.nextLine();
                        // this line turns String into a BigDecimal
                        moneyMethod.insertMoney(userInput.nextLine());
                        System.out.printf("Balance: %s\n", moneyMethod.getVendingBalance()); // Balance prints BillReaders Big Decimal
                        System.out.println("(5) Select Product \n(6) Finish Transaction");
                    }
                    if (purchaseMenuReader == 5) {
//                            InventoryFile inventory = new InventoryFile();
                        System.out.println(file.getInventory()); //can only read the file once, need to access the data structure set up in inventory file
                        System.out.println("Please select a product");
                        purchaseMenuReader = Integer.parseInt(userInput.nextLine()); // inventory index calling using position
                        int itemSelectionReader = Integer.parseInt(userInput.nextLine());
                        if (itemSelectionReader == 1) {
                            System.out.println("Please Take Your Potato Crisps");
                            System.out.println("(1) Buy Something Else \n(2) Exit");
                            itemSelectionReader = Integer.parseInt(userInput.nextLine());


                        } else if (purchaseMenuReader == 6) {

                            System.out.println("Thank you for shopping!");
                            System.out.println(giveChange);

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
        } catch (
                NumberFormatException e) {
            System.out.println("Please enter a number 1, 2, 3, 4, 5 or 6");

//    public BigDecimal getVendingBalance() {
//        return vendingBalance;
//    }


        }
    }
}