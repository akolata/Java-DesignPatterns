package creational.builder;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by Aleksander on 2017-07-09.
 */
public class Sandwich {

    private String  bread,
                    sauce;
    private boolean butter;
    private List<String> content;

    public Sandwich(){
        bread = "";
        sauce = "";
        butter = false;
        content = new LinkedList<>();
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setButter(boolean butter) {
        this.butter = butter;
    }

    public void addComponentToSandwichContent(String component){
        content.add(component);
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", sauce='" + sauce + '\'' +
                ", butter=" + butter +
                ", content=" + content +
                '}';
    }
}
