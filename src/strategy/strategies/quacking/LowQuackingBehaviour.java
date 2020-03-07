package strategy.strategies.quacking;

import strategy.behaviour_interfaces.IQuackBehaviour;

public class LowQuackingBehaviour implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Low quacking behaviour");
    }
}
