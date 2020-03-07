package strategy.strategies.quacking;

import strategy.behaviour_interfaces.IQuackBehaviour;

public class LoudQuackingBehaviour implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Loud quacking behaviour");
    }
}
