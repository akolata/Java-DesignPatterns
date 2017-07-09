package creational.factory;

/**
 * Created by Aleksander on 2017-07-09.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(VehicleFactory.getVehicle("CAR","Skoda","Octavia",1400,140));
        System.out.println(VehicleFactory.getVehicle("BUS","Mercedes","Citaro",7700,320));
    }
}
