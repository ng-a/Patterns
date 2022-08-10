package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Engine.*;
import Creational.AbstractFactory.Parts.*;

public class AudiFactory implements CarFactory {

    @Override
    public Parts CreateParts() {
        return new AudiParts();
    }

    @Override
    public Engine CreateEngine() {
        return new AudiEngine();
    }
}
