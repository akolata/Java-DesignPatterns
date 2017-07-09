package creational.factory;

/**
 * Created by Aleksander on 2017-07-09.
 */
public class VehicleFactory {

    public static Vehicle getVehicle(String type, String brand, String model, int engineSize, int hp){

        if (type.equals("CAR")){
            return new Car(brand,model,engineSize,hp);
        }else if(type.equals("BUS")){
            return new Bus(brand,model,engineSize,hp);
        }else {
            return null;
        }
    }
}
