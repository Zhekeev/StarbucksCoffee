package kz.epam.starbucks.coffeetype;

import kz.epam.starbucks.service.CoffeeMachine;

public class Americano extends CoffeeMachine {
   public final int AMERICANO_PRICE_IN_TENGE = 450;
   private final int hotWaterForAmericano = hotWaterInMilliliters - 470;
   private final int groundCoffeBeansForAmericano = groundCoffeeBeansInGramms -  56;

        public void AmericanoCoffee(){
            System.out.println("Вы выбрали Американо");
            System.out.println("");
            makeCoffee();
            eventually();
        }

    @Override
    public void makeCoffee() {
        System.out.println("Заливается горячяя вода");
        System.out.println("Добавляются зернышка кофе ");
        System.out.println("");
    }
    @Override
    public void eventually() {
        System.out.println("Ваш заказ Американо");
        System.out.println("В нем" + hotWaterForAmericano + " мл. горячей воды");
        System.out.println(groundCoffeBeansForAmericano + " г. молотого зернышка кофе");
    }
}
