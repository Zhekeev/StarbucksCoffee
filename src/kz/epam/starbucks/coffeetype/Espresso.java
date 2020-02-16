package kz.epam.starbucks.coffeetype;

public class Espresso implements TellAboutTheComposition {

    private final int ESPRESSO_PRICE_IN_TENGE = 1200;
    private final int HOT_WATER_FOR_ESPRESSO_IN_ML = 35;
    private final int GROUND_COFFEE_BEANS_FOR_ESPRESSO_IN_GR = 14;

    public void callTheEspressoCoffee(){

        System.out.println("Вы выбрали Эспрессо");
        tellAboutTheCompositionCoffee();
    }

    @Override
    public void tellAboutTheCompositionCoffee() {

        System.out.println("В составе кофе " + HOT_WATER_FOR_ESPRESSO_IN_ML+ " мл. горячей воды");
        System.out.println(GROUND_COFFEE_BEANS_FOR_ESPRESSO_IN_GR + " г. молотого зернышка кофе");
        System.out.println("Это кофейный напиток, отличающийся небольшим объемом, крепкий");
        System.out.println("и приготовленный из зерен мелкого помола под высоким давлением воды. ");
        System.out.println("Также у эспрессо должна быть крема. Соотношение веса молотого " +
                "кофе к весу готового напитка должно примерно 1:2…");
        System.out.println("©«Всемирный атлас кофе», Джеймс Хоффман");
        System.out.println("");
    }

    public int getEspressoPrice() {

        return ESPRESSO_PRICE_IN_TENGE;
    }
}
