package command;

import command.concrete_commands.LightOffCommand;
import command.concrete_commands.LightOnCommand;
import command.concrete_commands.LightUpCommand;
import command.invoker.Invoker;
import command.receiver.concrete_receiver.Light;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(String.format("Light intensity: %d %%" , light.getLightIntensity()));

        invoker.executeOff();
        invoker.executeUp();
        invoker.executeUp();

        System.out.println();

        System.out.println("Light on: " + light.isLightOn());
        System.out.println(String.format("Light intensity: %d %%" , light.getLightIntensity()));
    }
}
