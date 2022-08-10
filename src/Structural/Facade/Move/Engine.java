package Structural.Facade.Move;

import Structural.Facade.Enum.StatesEngine;

public class Engine {
    private StatesEngine states;

    public Engine() {}

    public StatesEngine getStates() {
        return this.states;
    }

    public void setStates(StatesEngine states) {
        this.states = states;
    }
}
