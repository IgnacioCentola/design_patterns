package strategy.strategies.flying;

import strategy.behaviour_interfaces.IFlyBehaviour;

public class LowFlyingBehaviour implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Low flying behaviour");
    }
}
