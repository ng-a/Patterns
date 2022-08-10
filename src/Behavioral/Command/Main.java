package Behavioral.Command;

import Behavioral.Command.Commands.CreateUserCommand;
import Behavioral.Command.Commands.DeleteUserCommand;
import Behavioral.Command.Commands.PrintUsersCommand;
import Behavioral.Command.Server.DateBase;
import Behavioral.Command.Server.Server;

public class Main {
    public static void main(String[] args) {
        DateBase date = new DateBase();

        Server server = new Server(
                new PrintUsersCommand(date),
                new CreateUserCommand(date),
                new DeleteUserCommand(date)
        );

        server.createUser("admin", "root");
        server.createUser("user1", "wte234");
        server.createUser("user13", "wte4dshg");


        server.printUsers();

        System.out.println("\n");
        server.deleteUser("user1", "wte234");

        System.out.println("\n");
        server.printUsers();
    }
}
