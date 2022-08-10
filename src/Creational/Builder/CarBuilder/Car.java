package Creational.Builder.CarBuilder;

import Creational.Builder.Enum.Fuel;
import Creational.Builder.Enum.Transmission;

public class Car {
    String name;
    String color;

    Fuel type_fuel;
    float engine_volume;
    Transmission transmission;

    public void print(){
        System.out.println(
                "\nName: " + name +
                "\nColor: " + color +
                "\nType fuel: " + type_fuel +
                "\nEngine volume: " + engine_volume +
                "\nTransmission: " + transmission);
    }
}

