package strategy.classes;

import strategy.behaviour_interfaces.IDisplayBehaviour;
import strategy.behaviour_interfaces.IFlyBehaviour;
import strategy.behaviour_interfaces.IQuackBehaviour;

public class Duck {
    private final String name;
    private final IQuackBehaviour quackBehaviour;
    private final IFlyBehaviour flyBehaviour;
    private final IDisplayBehaviour displayBehaviour;

    public Duck(String name, IQuackBehaviour quackBehaviour, IFlyBehaviour flyBehaviour, IDisplayBehaviour displayBehaviour) {
        this.name = name;
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
        this.displayBehaviour = displayBehaviour;
    }

    public String getName() {
        return name;
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public void display() {
        displayBehaviour.display();
    }

    public void fly() {
        flyBehaviour.fly();
    }
}
