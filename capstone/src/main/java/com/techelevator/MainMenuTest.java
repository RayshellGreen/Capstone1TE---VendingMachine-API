package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
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
        Map<String, Snacks> catalog = file.getProductCatalog();
        Scanner userInput = new Scanner(System.in);


        try {

            private void run() {
            boolean isMainMenuRunning = true;
            while (isMainMenuRunning) {
                System.out.println("(1) Display Vending Machine Items \n(2) Purchase \n(3) Exit");

                int mainMenuSelection = Integer.parseInt(userInput.nextLine());
                if (mainMenuSelection == 1) {
                    System.out.println(file.getCatalog());
                } else if (mainMenuSelection == 2) {
                    System.out.println();
                } else if (mainMenuSelection == 3) {
                    System.out.println("You have exited the vending machine");
                    break;
                }
            }
        }
            private void purchaseMenu() {
                boolean isPurchaseRunning = true;
                while (isPurchaseRunning) {
                    int purchaseMenuSelection = Integer.parseInt(userInput.nextLine());
                    if (purchaseMenuSelection == 1) {
                        System.out.println("Please Insert Money");
                        moneyMethod.insertMoney(userInput.nextLine());
                        System.out.printf("Balance: %s\n", moneyMethod.getVendingBalance());
                    } else if (purchaseMenuSelection == 2) {
                        System.out.println(file.getInventory());
                        System.out.println("Please select a product");
                    } else if (purchaseMenuSelection == 6) {
                        System.out.println("Please Take Your Change");
                        break;
                    }

                }

            }
        } catch(
                NumberFormatException e){
            System.out.println("Please enter a number 1, 2, 3, 4, 5 or 6");
        }
    }
}
