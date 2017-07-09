package creational.factory;

/**
 * Created by Aleksander on 2017-07-09.
 */
public abstract class Vehicle {

    protected String    type,
                        brand,
                        model;
    protected int   engineSize,
                    hp;

    public Vehicle(){}

    public Vehicle(String brand, String model, int engineSize, int hp) {
        this.brand = brand;
        this.model = model;
        this.engineSize = engineSize;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineSize=" + engineSize +
                ", hp=" + hp +
                '}';
    }
}
