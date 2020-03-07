package strategy.strategies.displaying;

import strategy.behaviour_interfaces.IDisplayBehaviour;

public class DisplaysAsGraphicsBehaviour implements IDisplayBehaviour {
    @Override
    public void display() {
        System.out.println("Display as graphics behaviour");
    }
}
