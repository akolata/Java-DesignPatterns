package creational.singleton;

/**
 * Created by Aleksander on 2017-07-09.
 */
public final class PriceList {

    private static PriceList instance;

    private PriceList(){
        System.out.println("In private constructor of PriceList");
    }

    public static PriceList getInstance() {
        if(instance == null){
            instance = new PriceList();
        }

        return instance;
    }
}
