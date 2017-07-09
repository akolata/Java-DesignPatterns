package creational.builder;

/**
 * Builder for ham sandwich
 * Created by Aleksander on 2017-07-09.
 */
public class HamSandwichBuilder
extends SandwichBuilder{

    @Override
    public void buildBread() {
        sandwich.setBread("white");
    }

    @Override
    public void buildSauce() {
        sandwich.setSauce("ketchup");
    }

    @Override
    public void buildButter() {
        sandwich.setButter(true);
    }

    @Override
    public void buildContent() {
        sandwich.addComponentToSandwichContent("ham");
        sandwich.addComponentToSandwichContent("salad");
    }
}
