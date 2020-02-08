package kz.epam.starbucks.coffeetype;

import kz.epam.starbucks.service.CoffeeMachine;

public class Cappuccino extends CoffeeMachine {
    public final int CAPPUCINO_PRICE_IN_TENGE = 1500;
    private final int hotWaterForCappucino = hotWaterInMilliliters - 720;
    private final int groundCoffeBeansForCappucino = groundCoffeeBeansInGramms -  56;
    private final int milkForCappucino = milkInMilliliters * 5 /groundCoffeBeansForCappucino;

    public void CappuccinoCoffee(){
        System.out.println("Вы выбрали Капучино");
        System.out.println("");
        makeCoffee();
        eventually();
    }

    @Override
    public void makeCoffee() {
        System.out.println("Заливается горячяя вода");
        System.out.println("Добавляются зернышка кофе ");
        System.out.println("Добавляется молоко");
        System.out.println("Все перемешивается");
    }

    @Override
    public void eventually() {
        System.out.println("Ваш заказ Капучино");
        System.out.println("В нем " + hotWaterForCappucino + " мл. горячей воды");
        System.out.println(groundCoffeBeansForCappucino + " г. молотого зернышка кофе");
        System.out.println(milkForCappucino + " мл. вспенного молока");
        System.out.println("");
    }
}
