package creational.builder;

/**
 * Waiter - the "director" of building a product
 * Created by Aleksander on 2017-07-09.
 */
public class Waiter {
    private SandwichBuilder sandwichBuilder;

    public void setSandwichBuilder(SandwichBuilder sandwichBuilder) {
        this.sandwichBuilder = sandwichBuilder;
    }

    public Sandwich getSandwich(){
        return sandwichBuilder.getSandwich();
    }

    public void createSandwich(){
        sandwichBuilder.createSandwich();
        sandwichBuilder.buildBread();
        sandwichBuilder.buildButter();
        sandwichBuilder.buildSauce();
        sandwichBuilder.buildContent();
    }
}
