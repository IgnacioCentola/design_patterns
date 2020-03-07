package decorator.concrete_components;

import decorator.component.Beverage;

public class Latte extends Beverage {

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public int getCost() {
        return 7;
    }
}
