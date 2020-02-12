package kz.epam.starbucks.coffeetype;

public class Espresso implements TellAboutCoffee {
    private final int ESPRESSO_PRICE_IN_TENGE = 1200;
    private final int HOT_WATER_FOR_ESPRESSO_IN_ML = 35;
    private final int GROUND_COFFEE_BEANS_FOR_ESPRESSO_IN_GR = 56;

    public void EspressoCoffee(){
        System.out.println("Вы выбрали эспрессо");
        tellAboutCoffee();
    }

    @Override
    public void tellAboutCoffee() {
        System.out.println("В нем " + HOT_WATER_FOR_ESPRESSO_IN_ML+ " мл. горячей воды");
        System.out.println(GROUND_COFFEE_BEANS_FOR_ESPRESSO_IN_GR + " г. молотого зернышка кофе");
    }

    public int getEspressoPrice() {

        return ESPRESSO_PRICE_IN_TENGE;
    }
}
