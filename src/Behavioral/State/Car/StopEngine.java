package Behavioral.State.Car;

public class StopEngine implements State {
    @Override
    public void doSomething() {
        System.out.println("Stop engine");
    }
}
