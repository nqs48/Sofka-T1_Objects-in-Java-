package Class;

import java.util.Date;

/**
 * @author Nestor Quiroga
 * Class Person
 */
public class Person {

    /**
     * Persons's name
     */
    private String name;

    /**
     * Persons's Lastname1
     */
    public String lastName1;

    /**
     * Persons's Lastname2
     */
    public String lastName2;

    /**
     * Persons's identification number
     */
    private String identification;

    /**
     * Persons's rank can be Administrator, Manager, Custumer,
     */
    protected String rank;

    /**
     * Persons's datebirth
     */
    public Date dateBirth;

    /**
     * Persons's height
     */
    public float height;

    //Methods Get and Set

    /**
     * Get the current person's name
     * @return returns the fruit's name type string
     */
    public String getName() {
        return name;
    }

    /**
     * Set the new person's name
     * @param name Contains the new person's name, type string
     */
    public void setName(String name) {
        this.name = name;
    }
}
