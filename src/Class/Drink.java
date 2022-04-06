package Class;

/**
 * @author Nestor Quiroga
 * Class Drink
 */
public class Drink {

    /**
     *
     */
    private String name;

    /**
     *
     */
    private float averageWeight;

    /**
     *
     */
    private float price;

    /**
     *
     */
    private boolean alcoholic;

    /**
     *
     */
    public Section category;


    //Methods Get and Set

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public boolean isAlcoholic() {
        return alcoholic;
    }

    /**
     *
     * @param alcoholic
     */
    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    /**
     *
     * @return
     */
    private float getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    private void setPrice(float price) {
        this.price = price;
    }
}
