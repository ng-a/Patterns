package Behavioral.Command.Commands;

import Behavioral.Command.Server.DateBase;

public class DeleteUserCommand extends Command {
    public DeleteUserCommand(DateBase date) {
        super(date);
    }

    @Override
    public void execute(String name, String password) {
        date.deleteUser(name, password);
    }
}
