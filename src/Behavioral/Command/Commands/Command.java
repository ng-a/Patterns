package Behavioral.Command.Commands;

import Behavioral.Command.Server.DateBase;

public abstract class Command {
    protected DateBase date;

    public Command(DateBase date){
        this.date = date;
    }

    public void execute() {};
    public abstract void execute(String name, String password);
}
