package creational.singleton;

/**
 * Created by Aleksander on 2017-07-09.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Address in memory of singletons : ");

        System.out.println(PriceList.getInstance());
        System.out.println(PriceList.getInstance());
        System.out.println(PriceListEnum.INSTANCE);
        System.out.println(PriceListEnum.INSTANCE);
    }
}
