package Structural.Bridge.Cars;

import Structural.Bridge.Type.Engine;

public abstract class Car {
    Engine type;

    public Car(Engine type){
        this.type = type;
    }

    public abstract void getInfo();
}
