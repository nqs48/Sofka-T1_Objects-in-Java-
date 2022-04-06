package Class;

import java.util.ArrayList;

/**
 * @author Nestor Quiroga
 * Class Fruit
 */
public class Fruit {
    /**
     * Fruit's name
     */
    public String name;

    /**
     * Fruit's weight
     */
    private float averageWeight;

    /**
     * Fruit's price
     */
    private float price;

    /**
     * Fruit's colors type arraylist, is a string list
     */
    public ArrayList<String> colors= new ArrayList<String>();

    /**
     * Fruit's category type Section, is a object type section
     */
    public Section category;


    //Methods Get and Set

    /**
     * Set the new fruit's color to the list of colors,
     * @param name Contains the new color type string
     */
    public void setColor(String name) {
        this.colors.add(name);
    }

    /**
     * Get the current fruit's color list
     * @return returns the fruit's colors list type ArrayList
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Get the current fruit's price
     * @return returns the fruit's price type float
     */
    private float getPrice() {
        return price;
    }

    /**
     * Set the new fruit's price
     * @param price Contains the new price type float
     */
    private void setPrice(float price) {
        this.price = price;
    }


}
