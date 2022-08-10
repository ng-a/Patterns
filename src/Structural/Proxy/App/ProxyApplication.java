package Structural.Proxy.App;

public class ProxyApplication implements  Application{
    @Override
    public void run() {
        System.out.println("Load resources");
        System.out.println("Run application");
    }
}
