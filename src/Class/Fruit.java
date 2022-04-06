package Class;

import java.util.ArrayList;

public class Fruit {
    public String name;
    private float averageWeight;
    private float price;
    public ArrayList<String> colors;
    public Seccion category;


    //Methods Get and Set

    public void setColor(String name) {
        this.colors.add(name);
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    private float getPrice() {
        return price;
    }

    private void setPrice(float price) {
        this.price = price;
    }


}
