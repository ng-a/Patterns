package Creational.AbstractFactory;

import Creational.AbstractFactory.Factory.*;

public class AbstractFactory {
    public static void main(String[] args) {
        CarFactory car = Factory("Audi");
        car.CreateEngine().info();
        car.CreateParts().info();
    }

    public static CarFactory Factory(String CarName){
        if(CarName == "Audi") {
            return new AudiFactory();
        }

        else if(CarName == "Toyota") {
            return new ToyotaFactory();
        }

        else if(CarName == "Mercedes") {
            return new MercedesFactory();
        }

        return null;
    }
}