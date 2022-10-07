package com.techelevator;

import java.util.Scanner;

public class MainMenu extends InventoryFile {

    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("(1) Display Vending Machine Items \n(2) Purchase \n(3) Exit");
            int mainMenuSelection = Integer.parseInt(userInput.nextLine());
            int displayItems = 1;
            int purchaseMenu = 2;
            int exitMachine = 3;
            int feedMoney = 4;
            int purchaseItem = 5;
            int exit = 6;


            int backToMainMenu = 0;
            if (mainMenuSelection == 1) {
                InventoryFile inventory = new InventoryFile();
                System.out.println(inventory.getInventory());
                System.out.println("(1) Back to Main Menu");
                backToMainMenu = Integer.parseInt(userInput.nextLine());
                if (backToMainMenu == 1) {
                    System.out.println("(1) Display Vending Machine Items \n(2) Purchase \n(3) Exit");
                    backToMainMenu = Integer.parseInt(userInput.nextLine());
                }

            } if (mainMenuSelection == 2 || backToMainMenu == 2) {
                System.out.println("(4) Feed Money \n(5) Select Product \n(6) Finish Transaction");
                int purchaseMenuReader = Integer.parseInt((userInput.nextLine()));
                if (purchaseMenuReader == 4) {
                    //purchase meanu reader .split (\\|
                    System.out.println();
                } if (purchaseMenuReader == 5) {
                    InventoryFile inventory = new InventoryFile();
                    System.out.println(inventory.getInventory());//need to be able to select item from inventory
                } else {                                           //
                    System.out.println("Transaction Finished");
                }
            } if (mainMenuSelection == 3 || backToMainMenu == 3) {
                System.out.println("Transaction Finished");
            } else {
                System.out.println("Please select an item");
            }


        }catch(Exception e){
            System.out.println("Please enter a number 1, 2 or 3");
        }
    }
}
