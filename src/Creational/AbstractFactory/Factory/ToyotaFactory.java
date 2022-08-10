package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Engine.*;
import Creational.AbstractFactory.Parts.*;

public class ToyotaFactory implements CarFactory {
    @Override
    public Parts CreateParts() {
        return new ToyotaParts();
    }

    @Override
    public Engine CreateEngine() {
        return new ToyotaEngine();
    }
}
