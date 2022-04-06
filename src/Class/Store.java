package Class;

import java.util.ArrayList;

public class Store {
    public String name;
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
}
