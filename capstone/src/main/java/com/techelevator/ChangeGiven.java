package com.techelevator;

import java.math.BigDecimal;

public class ChangeGiven {

public void changeGiven(double change) {

    int quarters = 0;
    int dimes = 0;
    int nickels = 0;

    while (change >= .25) {
        quarters = quarters + 1;
        change = change - .25;
    }
    while (change >= .10) {
        dimes = dimes + 1;
        change = change - .10;
    }
    while (change >= .05) {
        nickels = nickels + 1;
        change = change - .05;
    }

    System.out.println("Please accept your change in the amount of: " + quarters + "quarters " + dimes + "dimes " + nickels + "nickels.");
}

}
