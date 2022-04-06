package Class;

import java.util.ArrayList;

/**
 * @author Nestor Quiroga
 * Class Store
 */

public class Store {
    /**
     * Store's name
     */
    private String name;

    /**
     * Store's Direccion
     */
    private String direction;

    /**
     * Store's Telephone
     */
    private String telephone;

    /**
     * Store's Ubication
     */
    public String city;

    /**
     * Store's Administrator type Person
     */
    public Person administrador;

    /**
     * Store's section type arraylist, is a object list type section
     */
    public ArrayList<Section> sections;


    //Methods Setters and Getters

    /**
     * Get the current store's direction
     * @return returns the value Store's direction type String
     */
    private String getDirection() {
        return direction;
    }

    /**
     * Set the new store's direction
     * @param direction Contains the new direction type string
     */
    private void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * Get the current store's telephone
     * @return returns the value Store's telephone
     */
    private String getTelephone() {
        return telephone;
    }

    /**
     * Set the new store's telephone
     * @param telephone Contains the new telephone number type string
     */
    private void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Get the current store's name
     * @return returns the value store's name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the new store's name
     * @param name Contains the new store's name
     */
    public void setName(String name) {
        this.name = name;
    }
}
