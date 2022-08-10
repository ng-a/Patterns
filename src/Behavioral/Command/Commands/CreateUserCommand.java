package Behavioral.Command.Commands;

import Behavioral.Command.Server.DateBase;

public class CreateUserCommand extends Command{

    public CreateUserCommand(DateBase date){
        super(date);
    }

    @Override
    public void execute(String name, String password) {
        date.createUser(name, password);
    }
}
