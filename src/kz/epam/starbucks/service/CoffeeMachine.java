package kz.epam.starbucks.service;

abstract public class  CoffeeMachine{
public final int milkInMilliliters = 500;
public final int hotWaterInMilliliters = 1000;
public final int groundCoffeeBeansInGramms = 100;

    abstract public void makeCoffee();

    abstract public void eventually();

}
