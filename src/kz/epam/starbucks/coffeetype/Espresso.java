package kz.epam.starbucks.coffeetype;

import kz.epam.starbucks.service.CoffeeMachine;

public class Espresso extends CoffeeMachine {
    public final int ESPRESSO_PRICE_IN_TENGE = 1200;
    private final int hotWaterForEspresso = hotWaterInMilliliters - 965;
    private final int groundCoffeBeansForEspresso = groundCoffeeBeansInGramms -  56;

    public void EspressoCoffee(){
        System.out.println("Вы выбрали эспрессо");
        System.out.println("");
        makeCoffee();
        eventually();
    }

    @Override
    public void makeCoffee() {
        System.out.println("Заливается горячяя вода");
        System.out.println("Добавляются зернышка кофе ");
        System.out.println("Все перемешивается");
        System.out.println("");
    }
    @Override
    public void eventually() {
        System.out.println("Ваш заказ Эсперессо");
        System.out.println("В нем " + hotWaterForEspresso + " мл. горячей воды");
        System.out.println(groundCoffeBeansForEspresso + " г. молотого зернышка кофе");
    }
}
