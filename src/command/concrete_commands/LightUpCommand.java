package command.concrete_commands;

import command.command_interface.ICommand;
import command.receiver.concrete_receiver.Light;

public class LightUpCommand implements ICommand {
    private Light light;

    public LightUpCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnUp();
    }

    @Override
    public void undo() {
        light.turnDown();
    }
}
