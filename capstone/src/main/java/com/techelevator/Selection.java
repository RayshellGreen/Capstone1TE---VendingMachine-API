package com.techelevator;

public class Selection  extends InventoryFile {

    public Selection(int itemPick) {

        int itemSelection = 0;

        for (itemPick = 0; itemPick<inventory.size(); itemPick++) { // trying to call for loop in an extending to reach the array.
            if(getInventory().equals("")) {
                itemSelection++;
            }
        }

    }
}
