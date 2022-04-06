package View;

import Class.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Word, Im developing in Java");

        Person p1= new Person();
        p1.setName("George Harrison");

        Store s1 =new Store();
        s1.setName("Wallmart");
        s1.administrador= p1;

        System.out.println(s1.getName());
        System.out.println("El administrador de la tienda "+ s1.getName()+" es: " +s1.administrador.getName());

    }

}
