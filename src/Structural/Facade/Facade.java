package Structural.Facade;

import Structural.Facade.Move.Engine;
import Structural.Facade.Move.Transmission;

import Structural.Facade.Enum.StatesEngine;
import Structural.Facade.Enum.StatesTransmission;

public class Facade {
    private Engine engine = new Engine();
    private Transmission transmission = new Transmission();

    public void moveForward(){
        engine.setStates(StatesEngine.On);
        transmission.setStates(StatesTransmission.Forward);

        printStates();
        System.out.println("Move forward");
    }

    public void moveBackward(){
        engine.setStates(StatesEngine.On);
        transmission.setStates(StatesTransmission.Backward);

        printStates();
        System.out.println("Move backward");
    }

    public void printStates(){
        System.out.println(
                "\nEngine: " + engine.getStates() +
                "\nTransmission: " + transmission.getStates());
    }
}
