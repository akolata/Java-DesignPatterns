package creational.singleton;

/**
 * Created by Aleksander on 2017-07-09.
 */
public enum PriceListEnum {

    INSTANCE;

    PriceListEnum(){
        System.out.println("In PriceListEnum constructor");
    }
}
