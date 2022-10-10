package com.techelevator;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryFile {

//    public static void  main(String[] args) {


    List<Snacks> inventory = new ArrayList<>();

    public String getInventory() {
        String snacks = "";
        for (Snacks snack : inventory) {
            snacks += snack.getCode() + "|"+ snack.getName() + "|"+ snack.getPrice() + "|" + "\n";
        }
        return snacks;

    }

    // Accessing Vending machine file
//    final Scanner inputFile = new Scanner(System.in);

    public InventoryFile() {
        final File vendingMachineFile = new File("vendingmachine.csv"); // making file readable

        try (Scanner vendingMachineScan = new Scanner(vendingMachineFile)) { // calling vending machine file to read by scanner
            while (vendingMachineScan.hasNextLine()) { // Whilst vendingMachine has a next line it will scan
                String line = vendingMachineScan.nextLine(); // print scanned words in string for user

                String[] itemInfo = line.split("\\|"); // split into Array String at the end of each line
                String code = itemInfo[0]; // code place area 0
                String name = itemInfo[1]; // name place area 1
                String rawPrice = itemInfo[2]; // price place area 2
                BigDecimal price = new BigDecimal(rawPrice); // converting price to currency usage
                String type = itemInfo[3]; // type of snack area 3
                if (type.equalsIgnoreCase("Chips")) { // inventory will provide location and details when prompted
                    inventory.add(new Chips(code, name, rawPrice, type));
                } else if (type.equalsIgnoreCase("Candy")) {
                    inventory.add(new Candy(code, name, rawPrice, type));
                } else if (type.equalsIgnoreCase("Drink")) {
                    inventory.add(new Drinks(code, name, rawPrice, type));
                } else if (type.equalsIgnoreCase("Gum")) {
                    inventory.add(new Gum(code, name, rawPrice, type));
                }
//                System.out.println(line); // On screen String
            }
            while (vendingMachineScan.hasNextLine()) {
                String line = vendingMachineScan.nextLine(); // print scanned words in string for user
                String[] itemInfo = line.split("\\|"); // split into Array String at the end of each line

                if (itemInfo[1].startsWith("A", 1)) {
                    Snacks chip1 = new Chips(itemInfo[0], itemInfo[1], itemInfo[2], itemInfo[3]); // trying to pull array info into use
                    // can't figure out how to pull quad [3].
                    // please help me


                }

            }


        } catch (FileNotFoundException e) {
            // if failed, direct user to absolute file of vending machine.
            vendingMachineFile.getAbsoluteFile();
        }

//        try (Scanner itemPickScanner = new Scanner((Readable) inventory)) {
//
//            while (itemPickScanner.hasNextLine()) {
//
//            }
//        }


    }

}


//}
/**
 * //// if (user selects String, Int select line to drop. collecting prince and item |
 * if(user.selection is A1 then -- sout item price , user new balance
 */