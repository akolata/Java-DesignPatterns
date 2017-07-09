package creational.factory;

/**
 * Created by Aleksander on 2017-07-09.
 */
public class Car
extends Vehicle {

    public Car(){
        type = "CAR";
    }

    public Car(String brand, String model, int engineSize, int hp) {
        super(brand, model, engineSize, hp);
        type = "CAR";
    }
}
