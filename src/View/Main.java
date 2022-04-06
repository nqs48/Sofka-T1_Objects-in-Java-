package View;

import Class.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Word, Im developing in Java");

        /**
         * Creation of instance Person, and set a new name for this person
         */
        Person p1= new Person();
        p1.setName("George Harrison");

        /**
         * Creation of instance Store, and set a new administrator type person and a new name of Store
         */
        Store s1 =new Store();
        s1.setName("Wallmart");
        s1.administrador= p1;

        /**
         * Creation of instance Fruit, and set a new name of Fruit, set a new colors to arraylist
         */
        Fruit f1= new Fruit();

        f1.name= "Apple";
        f1.setColor("Red");
        f1.setColor("Green");
        f1.setColor("Yellow");
        f1.setColor("Gray");
        f1.setColor("White");

        //Output console with information
        System.out.println("Fruit's colors: "+ f1.getColors());

        //Output console with information
        System.out.println("El administrador de la tienda "+ s1.getName()+" es: " +s1.administrador.getName());

    }

}
