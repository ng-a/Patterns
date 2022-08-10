package Structural.Flyweight.Cars;

import java.util.Map;
import java.util.HashMap;

public class CarFactory{
    private static Map<String, Car> cars = new HashMap<>();

    public static Car getCars(String name, String color) {

        Car car = cars.get(name);

        if (car == null) {
            switch (name){
                case "Audi":
                    car = new Audi();
                    car.setColor(color);

                    System.out.println("Create audi");
                    break;

                case "Tesla":
                    car = new Tesla();
                    car.setColor(color);

                    System.out.println("Create tesla");
                    break;

                case "Mercedes":
                    car = new Mercedes();
                    car.setColor(color);

                    System.out.println("Create mercedes");
                    break;
            }
            cars.put(name, car);
        }

        return car;
    }
}
