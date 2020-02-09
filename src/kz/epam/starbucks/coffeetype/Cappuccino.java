package kz.epam.starbucks.coffeetype;

public class Cappuccino  {
    public final int CAPPUCINO_PRICE_IN_TENGE = 1500;
    private final int HOT_WATER_FOR_CAPPUCCINO_IN_ML = 720;
    private final int GROUNF_COFFEE_BEANS_FOR_CAPPUCCINO_IN_GR = 56;
    private final int MILK_FOR_CAPPUCCINO_IN_ML = 56;

    public void CappuccinoCoffee(){
        System.out.println("Вы выбрали Капучино");
        System.out.println("");
    }

    public void makeCoffee() {
        CappuccinoCoffee();
        System.out.println("Ваш заказ Капучино");
        System.out.println("В нем " + HOT_WATER_FOR_CAPPUCCINO_IN_ML + " мл. горячей воды");
        System.out.println(GROUNF_COFFEE_BEANS_FOR_CAPPUCCINO_IN_GR + " г. молотого зернышка кофе");
        System.out.println(MILK_FOR_CAPPUCCINO_IN_ML + " мл. вспенного молока");
        System.out.println("");
    }
}
