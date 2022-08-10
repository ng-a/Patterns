package Behavioral.Command.Commands;

import Behavioral.Command.Server.DateBase;

public class PrintUsersCommand extends Command{
    public PrintUsersCommand(DateBase date) {
        super(date);
    }
    @Override
    public void execute() {
        date.printUsers();
    }
    @Override
    public void execute(String name, String password) {}
}
