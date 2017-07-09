package creational.prototype;

/**
 * Created by Aleksander on 2017-07-09.
 */
public abstract class Building
implements Cloneable{

    protected int id;
    protected String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() {
        Object clone = null;

        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }
}
