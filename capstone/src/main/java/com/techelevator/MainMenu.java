package com.techelevator;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("(1) Display Vending Machine Items \n(2) Purchase \n(3) Exit");
        int mainMenuSelection = Integer.parseInt(userInput.nextLine());

        if (mainMenuSelection == 1) {
            System.out.println(); //PUT VENDING MACHINE ITEMS LIST HERE
            int displayInventory = Integer.parseInt((userInput.nextLine()));
        } else if (mainMenuSelection == 2) {
            System.out.println("(1) Feed Money \n(2) Select Product \n(3) Finish Transaction");
            int purchaseMenu = Integer.parseInt((userInput.nextLine()));
            if (purchaseMenu == 1) {
                System.out.println();
            } else if (purchaseMenu == 2) {
                System.out.println(); //Product menu needs to go here
            } else {
                System.out.println("Transaction Finished");
            }
        } else if (mainMenuSelection == 3){
            System.out.println("Transaction Finished");
        }else {
            System.out.println("Please Select either 1, 2 or 3");
        }


    }
}

