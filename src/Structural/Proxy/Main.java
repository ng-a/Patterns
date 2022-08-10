package Structural.Proxy;

import Structural.Proxy.App.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Create app");
        Application app = new NewApplication();

        System. out.println("\nRun app");
        app.run();

        System.out.println("\n\nCreate proxy app");
        app = new ProxyApplication();

        System.out.println("\nRun proxy app");
        app.run();

    }
}