package Structural.Bridge.Cars;

import Structural.Bridge.Type.Engine;

public class Tesla extends Car{
    private final String name = "Tesla";

    public Tesla(Engine type) {
        super(type);
    }

    @Override
    public void getInfo() {
        System.out.println(
                "\nName: " + name +
                "\nType engine: " + super.type.getType());
    }
}
