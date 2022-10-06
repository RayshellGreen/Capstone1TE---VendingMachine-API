package com.techelevator;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryFile {

    public static void  main(String[] args) {


        List<Snacks> inventory = new ArrayList<>();



        // Accessing Vending machine file
        final Scanner inputFile = new Scanner(System.in);

        final File vendingMachineFile =  new File("vendingmachine.csv"); // making file readable

        try (Scanner vendingMachineScan = new Scanner(vendingMachineFile)) { // calling vending machine file to read by scanner
            while (vendingMachineScan.hasNextLine()) { // Whilst vendingMachine has a next line it will scan
                String line = vendingMachineScan.nextLine(); // print scanned words in string for user
                String[] pair = line.split("\\|");
                   String code = pair[0];
                   String name = pair[1];
                    String rawPrice = pair[2];
                    BigDecimal price = new BigDecimal(rawPrice);
                    String type = pair[3];
                    if (type.equalsIgnoreCase("Chips")) {
                        inventory.add(new Chips(name, code, price));
                    } else if(type.equalsIgnoreCase("Candy")) {
                        inventory.add(new Candy(name, code, price));
                    } else if (type.equalsIgnoreCase("Drink")) {
                        inventory.add(new Drinks(name, code, price));
                    } else if (type.equalsIgnoreCase("Gum")) {
                    inventory.add(new Gum(name, code, price));
                }

                        System.out.println(line); // On screen String
            }


        } catch (FileNotFoundException e) {
            // if failed, direct user to absolute file of vending machine.
            vendingMachineFile.getAbsoluteFile();
        }




    }


}
/**
 * //// if (user selects String, Int select line to drop. collecting prince and item |
 *  if(user.selection is A1 then -- sout item price , user new balance
 */