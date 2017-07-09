package creational.prototype;

/**
 * Created by Aleksander on 2017-07-09.
 */
public class Main {

    public static void main(String[] args) {

        BuildingStorage.addBuildingsToStorage();

        House house1 = (House) BuildingStorage.getBuildingById(1);
        House house2 = (House) BuildingStorage.getBuildingById(1);

        Block block1 = (Block) BuildingStorage.getBuildingById(2);
        Block block2 = (Block) BuildingStorage.getBuildingById(2);

        printInformationAboutBuilding(house1);
        printInformationAboutBuilding(house2);
        printInformationAboutBuilding(block1);
        printInformationAboutBuilding(block2);
    }

    private static void printInformationAboutBuilding(Building building){
        System.out.println("Building address in memory : " + building + " , type : " + building.getType());
    }
}
