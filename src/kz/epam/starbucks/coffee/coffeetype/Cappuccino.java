package kz.epam.starbucks.coffee.coffeetype;

import kz.epam.starbucks.coffee.Coffee;

public class Cappuccino implements Coffee {
    private final int CAPPUCCINO_PRICE_IN_TENGE = 1500;
    
    @Override
    public void getCoffeeType() {
        System.out.println("Cappuccino is an Italian espresso-based coffee drink with the addition of heated frothed milk.");
        System.out.println("");
    }

    public int getCappuccinoPrice() {
        return CAPPUCCINO_PRICE_IN_TENGE;
    }
}
