package Creational.Builder.CarBuilder;

import Creational.Builder.Enum.Fuel;
import Creational.Builder.Enum.Transmission;
public class CreateCar implements CarBuilder {
    private Car car = new Car();

    @Override
    public CarBuilder setName(String name) {
        car.name = name;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        car.color = color;
        return this;
    }

    @Override
    public CarBuilder setVolume(float volume) {
        car.engine_volume = volume;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        car.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setFuel(Fuel fuel) {
        car.type_fuel = fuel;
        return this;
    }
    @Override
    public Car create(){
        return car;
    }
}
