package Behavioral.Template.Developer;

public class JavaDeveloper extends Developer {

    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    public void info() {
        System.out.println(super.getName() + " Java developer");
    }
}
