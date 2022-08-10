package Structural.Composite;

import Structural.Composite.Cars.*;

public class Main {
    public static void main(String[] args) {

        Car audi = new Audi();
        Car tesla = new Tesla();
        Car mercedes = new Mercedes();

        Composite showroom = new Composite();

        System.out.println("\n\tAdd");
        showroom.add(audi);
        showroom.add(tesla);
        showroom.add(mercedes);

        showroom.getInfo();

        System.out.println("\n\tRemove");
        showroom.remove(tesla);
        showroom.getInfo();
    }
}