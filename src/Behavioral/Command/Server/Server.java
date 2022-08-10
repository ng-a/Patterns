package Behavioral.Command.Server;

import Behavioral.Command.Commands.Command;

public class Server {

    Command print;
    Command create;
    Command delete;

    public Server(Command print, Command create, Command delete) {
        this.print = print;
        this.create = create;
        this.delete = delete;;
    }

    public void printUsers() {
        print.execute();
    }

    public void createUser(String name, String password) {
        create.execute(name, password);
    }

    public void deleteUser(String name, String password) {
        delete.execute(name, password);
    }

}
