package Creational.Builder.CarBuilder;

import Creational.Builder.Enum.Fuel;
import Creational.Builder.Enum.Transmission;

public interface CarBuilder {
    CarBuilder setName(String name);
    CarBuilder setColor(String color);

    CarBuilder setFuel(Fuel fuel);
    CarBuilder setVolume(float volume);
    CarBuilder setTransmission(Transmission transmission);

    Car create();
}
