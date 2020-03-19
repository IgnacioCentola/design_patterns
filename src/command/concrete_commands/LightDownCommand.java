package command.concrete_commands;

import command.command_interface.ICommand;
import command.receiver.concrete_receiver.Light;

public class LightDownCommand implements ICommand {
    private Light light;

    public LightDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnDown();
    }

    @Override
    public void undo() {
        light.turnUp();
    }
}
