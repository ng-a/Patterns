package Behavioral.Visitor.Developer;

import Behavioral.Visitor.Visitor.Visitor;

public class JavaDeveloper implements Developer {
    private String name;

    public JavaDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void info(Visitor visitor) {
        visitor.infoJava(name);
    }
}
