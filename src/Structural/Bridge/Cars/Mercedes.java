package Structural.Bridge.Cars;

import Structural.Bridge.Type.Engine;

public class Mercedes extends Car{
    private final String name = "Mercedes";

    public Mercedes(Engine type) {
        super(type);
    }

    @Override
    public void getInfo() {
        System.out.println(
                "\nName: " + name +
                "\nType engine: " + super.type.getType());
    }
}
