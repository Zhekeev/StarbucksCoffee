package kz.epam.starbucks.coffee.coffeetype;

import kz.epam.starbucks.coffee.Coffee;

public class Americano implements Coffee {
   private final int AMERICANO_PRICE_IN_TENGE = 1350;

    @Override
    public void getCoffeeType() {
        System.out.println("Americano is a type of coffee drink prepared by diluting an espresso with hot water, " +
                "giving it a similar strength to, but different flavor from, traditionally brewed coffee.");
        System.out.println("");
    }

    public int getAmericanoPrice(){

        return AMERICANO_PRICE_IN_TENGE;
    }
}
