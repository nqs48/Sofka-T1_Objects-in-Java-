package Class;

/**
 * @author Nestor Quiroga
 * Class Section
 */
public class Section {

    /**
     * Section's name can be: fruits, drinks, cleaning, type string
     */
    private String name;

    /**
     * Section's hall, is the location on the store
     */
    private String hall;

    /**
     * Section's manager type Person, is the boss of the section
     */
    private Person manager;

    //Methods Get and Set

    /**
     * Get the current Section's name
     * @return returns the value section's name type string
     */
    private String getName() {
        return name;
    }

    /**
     * Set the new section's name
     * @param name Contains the new section's name to set, type string
     */
    private void setName(String name) {
        this.name = name;
    }

}
