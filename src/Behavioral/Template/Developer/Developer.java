package Behavioral.Template.Developer;

public abstract class Developer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void  info();
}
