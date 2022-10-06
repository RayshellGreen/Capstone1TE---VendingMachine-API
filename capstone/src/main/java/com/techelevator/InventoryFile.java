package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InventoryFile {

    public static void  main(String[] args) {

        // Accessing Vending machine file
        final Scanner inputFile = new Scanner(System.in);

        final File vendingMachineFile =  new File("vendingmachine.csv"); // making file readable

        try (Scanner vendingMachineScan = new Scanner(vendingMachineFile)) { // calling vending machine file to read by scanner
            while (vendingMachineScan.hasNextLine()) { // Whilst vendingMachine has a next line it will scan
                String line = vendingMachineScan.nextLine(); // print scanned words in string for user

                System.out.println(line); // On screen String
            }


        } catch (FileNotFoundException e) {
            // if failed, direct user to absolute file of vending machine.
            vendingMachineFile.getAbsoluteFile();
        }



    }


}
