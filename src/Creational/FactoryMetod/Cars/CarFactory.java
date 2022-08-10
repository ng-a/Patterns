package Creational.FactoryMetod.Cars;

public class CarFactory {
    public Car getCar(String carType) {
        if(carType == "DieselCar") {
            return new DieselCar();
        }

        else if(carType == "ElectricCar") {
            return new ElectricCar();
        }

        else if(carType == "GasolineCar") {
            return new GasolineCar();
        }

        return null;
    }
}
