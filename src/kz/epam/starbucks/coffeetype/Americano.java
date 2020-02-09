package kz.epam.starbucks.coffeetype;

public class Americano  {
   public final int AMERICANO_PRICE_IN_TENGE = 450;
   private final int HOT_WATER_FOR_AMERICANO = 470;
   private final int GROUND_COFFEE_BEANS_FOR_AMERICANO = 56;

        public void AmericanoCoffee(){
            System.out.println("Вы выбрали Американо");
            System.out.println("");
            makeCoffee();
        }

    public void makeCoffee() {
        System.out.println("Ваш заказ Американо");
        System.out.println("В нем" + HOT_WATER_FOR_AMERICANO + " мл. горячей воды");
        System.out.println(GROUND_COFFEE_BEANS_FOR_AMERICANO + " г. молотого зернышка кофе");
    }
}
