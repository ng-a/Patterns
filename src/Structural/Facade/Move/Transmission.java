package Structural.Facade.Move;

import Structural.Facade.Enum.StatesTransmission;

public class Transmission {
    private StatesTransmission states;

    public Transmission() {}


    public StatesTransmission getStates() {
        return this.states;
    }

    public void setStates(StatesTransmission states) {
        this.states = states;
    }
}
