package strategy.strategies.flying;

import strategy.behaviour_interfaces.IFlyBehaviour;

public class NoFlyingBehaviour implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("No flying behaviour");
    }
}
