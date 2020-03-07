package strategy.strategies.flying;

import strategy.behaviour_interfaces.IFlyBehaviour;

public class JetFlyingBehaviour implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Jet flying behaviour");
    }
}
