package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Engine.*;
import Creational.AbstractFactory.Parts.*;

public interface CarFactory {
    Parts CreateParts();
    Engine CreateEngine();
}
