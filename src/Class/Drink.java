package Class;

/**
 * @author Nestor Quiroga
 * Class Drink
 */
public class Drink {

    /**
     * Drink's name
     */
    private String name;

    /**
     * Drink's weight
     */
    private float averageWeight;

    /**
     * Drink's price
     */
    private float price;

    /**
     * Drink's validation type, can be true or false
     */
    private boolean alcoholic;

    /**
     * Drink's category type Section, is a object type section
     */
    public Section category;


    //Methods Get and Set

    /**
     * Get the current drink's name
     * @return returns the drink's name type string
     */
    public String getName() {
        return name;
    }

    /**
     * Set the new drink's name
     * @param name Contains the new drink's name, type string
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the current drink's type
     * @return returns the drink's type, return a boolean value
     */
    public boolean isAlcoholic() {
        return alcoholic;
    }

    /**
     * Set the new drink's type, it's boolean
     * @param alcoholic Contains the new drink's type, receive a boolean value
     */
    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    /**
     * Get the current drink's price
     * @return returns the drink's price type float
     */
    private float getPrice() {
        return price;
    }

    /**
     * Set the new drink's price
     * @param price Contains the new price type float
     */
    private void setPrice(float price) {
        this.price = price;
    }
}
