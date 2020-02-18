package kz.epam.starbucks.coffee;

import kz.epam.starbucks.coffee.coffeetype.Americano;
import kz.epam.starbucks.coffee.coffeetype.Cappuccino;
import kz.epam.starbucks.coffee.coffeetype.CoffeeType;
import kz.epam.starbucks.coffee.coffeetype.Espresso;

public class CoffeeFactory {
    public Coffee getCoffee(CoffeeType type){
        Coffee toReturn;
        switch (type){
            case AMERICANO:
                toReturn = new Americano();
                break;
            case ESPRESSO:
                toReturn = new Espresso();
                break;
            case CAPPUCCINO:
                toReturn = new Cappuccino();
                break;
            default:
                throw new IllegalArgumentException("Wrong type " + type);
        }
        return toReturn;
    }
}
