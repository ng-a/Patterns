package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Engine.*;
import Creational.AbstractFactory.Parts.*;

public class MercedesFactory implements CarFactory {

    @Override
    public Parts CreateParts() {
        return new MercedesParts();
    }

    @Override
    public Engine CreateEngine() {
        return new MercedesEngine();
    }
}
