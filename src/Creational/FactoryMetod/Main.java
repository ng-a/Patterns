package Creational.FactoryMetod;

import Creational.FactoryMetod.Cars.*;

public class Main {
    public static void main(String[] args) {
        CarFactory type = new CarFactory();

        Car a = type.getCar("ElectricCar");
        a.info();

    }
}