package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Aleksander on 2017-07-09.
 */
public class BuildingStorage {

    public static Map<Integer,Building> buldings = new HashMap<>();

    public static Building getBuildingById(int id){
        Building building = buldings.get(id);
        return (Building) building.clone();
    }

    public static void addBuildingsToStorage(){

        House house = new House();
        house.setId(1);

        Block block = new Block();
        block.setId(2);

        buldings.put(house.getId(),house);
        buldings.put(block.getId(),block);
    }
}
