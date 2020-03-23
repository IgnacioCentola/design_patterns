package command;

import command.concrete_commands.LightOffCommand;
import command.concrete_commands.LightOnCommand;
import command.concrete_commands.LightUpCommand;
import command.invoker.Invoker;
import command.receiver.concrete_receiver.Light;

public class Main {
    public static void main(String[] args) {

        /*
        Undo-command logic not implemented in this case fo the sake of
        simplicity

        Keep in mind that this pattern implements some sort of state management
        as well to keep track of executions and undo-tions (and this case
        , e.g. to keep track of the light intensity to fetch that state every time
        it is turned on)
         */

        Light light = new Light();
        Invoker invoker =
                new Invoker(new LightOnCommand(light),
                        new LightOffCommand(light),
                        new LightUpCommand(light),
                        new LightOffCommand(light));

        invoker.executeOn();
        invoker.executeUp();
        invoker.executeUp();

        System.out.println("Light on: " + light.isLightOn());
        System.out.println(String.format("Light intensity: %d %%", light.getLightIntensity()));

        invoker.executeOff();
        invoker.executeUp();
        invoker.executeUp();

        System.out.println();

        System.out.println("Light on: " + light.isLightOn());
        System.out.println(String.format("Light intensity: %d %%", light.getLightIntensity()));
    }
}
