package Structural.Proxy.App;

public class NewApplication implements Application{
    public NewApplication(){
        System.out.println("Load resources");
    }

    @Override
    public void run() {
        System.out.println("Run application");
    }
}
