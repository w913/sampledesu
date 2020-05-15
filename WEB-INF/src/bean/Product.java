package bean;

import java.io.Serializable;

/**
 * Product
 */
public class Product implements Serializable {

    private int id;
    private String name;
    private int price;

    public int getId () {
        return id;
    }
    public String getName () {
        return name;
    }
    public int getPrice () {
        return price;
    }

    public void setId (int id) {
        this.id = id;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setPrice (int price) {
        this.price = price;
    }
}