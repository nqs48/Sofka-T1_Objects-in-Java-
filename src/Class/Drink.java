package Class;

public class Drink {
    private String name;
    private float averageWeight;
    private float price;
    private boolean alcoholic;
    public Seccion category;

    //Methods Get and Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    private float getPrice() {
        return price;
    }

    private void setPrice(float price) {
        this.price = price;
    }
}
