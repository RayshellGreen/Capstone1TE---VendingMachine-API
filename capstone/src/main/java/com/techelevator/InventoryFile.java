package com.techelevator;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InventoryFile {

    public static void  main(String[] args) {
        List<String> a1List = new ArrayList<String>();
        List<String> a2List = new ArrayList<String>();
        List<String> a3List = new ArrayList<String>();
        List<String> a4List = new ArrayList<String>();
        List<String> b1List = new ArrayList<String>();
        List<String> b2List = new ArrayList<String>();
        List<String> b3List = new ArrayList<String>();
        List<String> b4List = new ArrayList<String>();
        List<String> c1List = new ArrayList<String>();
        List<String> c2List = new ArrayList<String>();
        List<String> c3List = new ArrayList<String>();
        List<String> c4List = new ArrayList<String>();
        List<String> d1List = new ArrayList<String>();
        List<String> d2List = new ArrayList<String>();
        List<String> d3List = new ArrayList<String>();
        List<String> d4List = new ArrayList<String>();



        // Accessing Vending machine file
        final Scanner inputFile = new Scanner(System.in);

        final File vendingMachineFile =  new File("vendingmachine.csv"); // making file readable

        try (Scanner vendingMachineScan = new Scanner(vendingMachineFile)) { // calling vending machine file to read by scanner
            while (vendingMachineScan.hasNextLine()) { // Whilst vendingMachine has a next line it will scan
                String line = vendingMachineScan.nextLine(); // print scanned words in string for user
                //String


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