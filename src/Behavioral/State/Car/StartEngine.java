package Behavioral.State.Car;

public class StartEngine implements State {
    @Override
    public void doSomething() {
        System.out.println("Start engine");
    }
}
