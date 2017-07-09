package creational.builder;

/**
 * Created by Aleksander on 2017-07-09.
 */
public class Main {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        waiter.setSandwichBuilder(new HamSandwichBuilder());
        waiter.createSandwich();

        System.out.println("Ham sandwich : " + waiter.getSandwich());

        waiter.setSandwichBuilder(new VegetarianSandwichBuilder());
        waiter.createSandwich();

        System.out.println("Vegetarian sandwich : " + waiter.getSandwich());
    }
}
