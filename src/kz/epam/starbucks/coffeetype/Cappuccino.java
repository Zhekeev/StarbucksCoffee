package kz.epam.starbucks.coffeetype;

public class Cappuccino implements TellAboutTheComposition {

    private final int CAPPUCINO_PRICE_IN_TENGE = 1500;
    private final int HOT_WATER_FOR_CAPPUCCINO_IN_ML = 500;
    private final int GROUNF_COFFEE_BEANS_FOR_CAPPUCCINO_IN_GR = 200;
    private final int MILK_FOR_CAPPUCCINO_IN_ML = 80;

    public void callTheCappuccinoCoffee(){

        System.out.println("Вы выбрали Капучино");
        tellAboutTheCompositionCoffee();
    }

    @Override
    public void tellAboutTheCompositionCoffee() {

        System.out.println("В составе кофе " + HOT_WATER_FOR_CAPPUCCINO_IN_ML + " мл. горячей воды");
        System.out.println(GROUNF_COFFEE_BEANS_FOR_CAPPUCCINO_IN_GR + " г. молотого зернышка кофе");
        System.out.println(MILK_FOR_CAPPUCCINO_IN_ML + " мл. вспенного молока");
        System.out.println("Кофейный напиток на основе эспрессо с добавлением в него подогретого вспененного молока.");
        System.out.println("Толстый слой густой кремовой пенки вместе со сладковатым согревающим");
        System.out.println("молоком и богатым вкусом хорошо сваренного эспрессо – это абсолютное наслаждение…");
        System.out.println("©«Всемирный атлас кофе», Джеймс Хоффман");
        System.out.println("");
    }

    public int getCappucinoPrice() {

        return CAPPUCINO_PRICE_IN_TENGE;
    }
}
