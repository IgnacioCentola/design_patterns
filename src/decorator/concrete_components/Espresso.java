package decorator.concrete_components;

import decorator.component.Beverage;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public int getCost() {
        return 5;
    }
}
