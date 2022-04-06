package Class;

import java.util.ArrayList;

public class Store {
    private String name;
    private String direction;
    private String telephone;
    public String city;
    private Person administrador;
    public ArrayList<Seccion> seccions;


    private String getDirection() {
        return direction;
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }

    private String getTelephone() {
        return telephone;
    }

    private void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
