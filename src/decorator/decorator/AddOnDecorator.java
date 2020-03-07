package decorator.decorator;

import decorator.component.Beverage;

public abstract class AddOnDecorator extends Beverage {

    public abstract int getCost();

    public abstract String getDescription();

}
