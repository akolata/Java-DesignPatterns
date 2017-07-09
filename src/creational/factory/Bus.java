package creational.factory;

/**
 * Created by Aleksander on 2017-07-09.
 */
public class Bus
extends Vehicle{

    public Bus() {
        type = "BUS";
    }

    public Bus(String brand, String model, int engineSize, int hp) {
        super(brand, model, engineSize, hp);
        type = "BUS";
    }
}
