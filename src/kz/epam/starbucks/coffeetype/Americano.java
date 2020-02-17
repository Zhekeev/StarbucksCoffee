package kz.epam.starbucks.coffeetype;

public class Americano implements TellAboutTheComposition {
   private final int AMERICANO_PRICE_IN_TENGE = 1350;
   private final int HOT_WATER_FOR_AMERICANO = 470;
   private final int GROUND_COFFEE_BEANS_FOR_AMERICANO = 56;

   public void callTheAmericanoCoffee(){
            System.out.println("Вы выбрали Американо");
            tellAboutTheCompositionCoffee();
   }

    @Override
    public void tellAboutTheCompositionCoffee() {
            System.out.println("В составе кофе " + HOT_WATER_FOR_AMERICANO + " мл. горячей воды");
            System.out.println(GROUND_COFFEE_BEANS_FOR_AMERICANO + " г. молотого зернышка кофе");
            System.out.println("Интересный факт: фильтр-кофе vs американо! Все началось с американских " +
                    "солдат и их любви к черному фильтр кофе.");
            System.out.println("Напиток, который готовят в Эспрессо-машине, получил название “Американо”, " +
                    "во время 2-й Мировой войны при оккупации  Италии войсками США.)");
            System.out.println("Американские солдаты, скучавшие по родине и черному кофе, заказывали в Итальянских кафе,");
            System.out.println("непривычно крепкий для них “Эспрессо” и разбавляли его горячей водой," +
                    " что бы напиток стал похож на фильтр-кофе.");
            System.out.println("Тогда то, Итальянские бариста и прозвали его “Американо” (что значит:" +
                    " Американский), и записали рецепт: “божественный Эспрессо разбавить кипятком до неузнаваемости");
            System.out.println("");
    }

    public int getAmericanoPrice(){
        return AMERICANO_PRICE_IN_TENGE;
    }
}
