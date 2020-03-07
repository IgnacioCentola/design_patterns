package strategy.strategies.quacking;

import strategy.behaviour_interfaces.IQuackBehaviour;

public class NoQuackingBehaviour implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No quacking behaviour");
    }
}
