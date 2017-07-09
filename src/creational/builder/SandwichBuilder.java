package creational.builder;

/**
 * Abstract builder for sanchwiches - no matter what type
 * Created by Aleksander on 2017-07-09.
 */
public abstract class SandwichBuilder {

    protected Sandwich sandwich;

    public Sandwich getSandwich(){
        return sandwich;
    }

    public void createSandwich(){
        sandwich = new Sandwich();
    }

    public abstract void buildBread();
    public abstract void buildSauce();
    public abstract void buildButter();
    public abstract void buildContent();
}
