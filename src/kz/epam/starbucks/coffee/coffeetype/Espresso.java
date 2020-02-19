package kz.epam.starbucks.coffee.coffeetype;

import kz.epam.starbucks.coffee.Coffee;

public class Espresso implements Coffee {
    private final int ESPRESSO_PRICE_IN_TENGE = 1200;

    @Override
    public void getCoffeeType() {
        System.out.println("Espresso is a coffee-making method of Italian origin, " +
                "in which a small amount of nearly boiling water is forced under pressure (expressed) " +
                "through finely-ground coffee beans.");
        System.out.println("");
    }

    public int getEspressoPrice() {

        return ESPRESSO_PRICE_IN_TENGE;
    }
}
