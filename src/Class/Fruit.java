package Class;

import java.util.ArrayList;

public class Fruit {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;


    //Methods Get and Set

    public void setColor(String name) {
        this.colors.add(name);
    }

    public ArrayList<String> getColors() {
        return colors;
    }

}
