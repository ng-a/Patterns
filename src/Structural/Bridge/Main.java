package Structural.Bridge;

import Structural.Bridge.Cars.*;
import Structural.Bridge.Type.*;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Mercedes(new DieselEngine());
        mercedes.getInfo();

        Car tesla = new Tesla(new ElectricEngine());
        tesla.getInfo();
    }
}