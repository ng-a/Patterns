package Structural.Flyweight;

import Structural.Flyweight.Cars.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(CarFactory.getCars("Audi", "Black"));
        cars.add(CarFactory.getCars("Audi", "Black"));
        cars.add(CarFactory.getCars("Audi", "Black"));
        cars.add(CarFactory.getCars("Audi", "Green"));
        cars.add(CarFactory.getCars("Audi", "White"));
        cars.add(CarFactory.getCars("Mercedes", "Black"));
        cars.add(CarFactory.getCars("Mercedes", "Yellow"));
        cars.add(CarFactory.getCars("Mercedes", "Black"));
        cars.add(CarFactory.getCars("Mercedes", "Cyan"));
        cars.add(CarFactory.getCars("Mercedes", "Black"));
        cars.add(CarFactory.getCars("Mercedes", "Black"));
        cars.add(CarFactory.getCars("Mercedes", "Blue"));

        for (Car car: cars) {
            car.getInfo();
        }
    }
}