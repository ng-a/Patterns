package Creational.Builder;

import Creational.Builder.Enum.*;
import Creational.Builder.CarBuilder.*;

public class Builder {
    public static void main(String[] args) {
        Car car = new CreateCar()
                .setName("Audi")
                .setColor("Black")
                .setTransmission(Transmission.AUTOMATIC)
                .create();

        car.print();

        car = new CreateCar()
                .setName("Mercedes")
                .setVolume(3.0f)
                .setColor("Black")
                .setFuel(Fuel.DIESEL)
                .create();

        car.print();
    }
}