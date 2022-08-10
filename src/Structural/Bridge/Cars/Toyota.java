package Structural.Bridge.Cars;

import Structural.Bridge.Type.Engine;

public class Toyota extends Car{
    private final String name = "Toyota";

    public Toyota(Engine type) {
        super(type);
    }

    @Override
    public void getInfo() {
        System.out.println(
                "\nName: " + name +
                "\nType engine: " + super.type.getType());
    }
}
