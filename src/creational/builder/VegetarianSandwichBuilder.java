package creational.builder;

/**
 * Builder for vegetarian sandwich
 * Created by Aleksander on 2017-07-09.
 */
public class VegetarianSandwichBuilder
extends SandwichBuilder{

    @Override
    public void buildBread() {
        sandwich.setBread("rye");
    }

    @Override
    public void buildSauce() {
        sandwich.setSauce("garlic");
    }

    @Override
    public void buildButter() {
        sandwich.setButter(false);
    }

    @Override
    public void buildContent() {
        sandwich.addComponentToSandwichContent("salad");
        sandwich.addComponentToSandwichContent("onion");
        sandwich.addComponentToSandwichContent("cheese");
        sandwich.addComponentToSandwichContent("olive");
    }
}
