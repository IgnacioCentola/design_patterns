package strategy.strategies.displaying;

import strategy.behaviour_interfaces.IDisplayBehaviour;

public class DisplayAsTextBehaviour implements IDisplayBehaviour {
    @Override
    public void display() {
        System.out.println("Display as text behaviour");
    }
}
