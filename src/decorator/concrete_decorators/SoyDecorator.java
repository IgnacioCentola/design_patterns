package decorator.concrete_decorators;

import decorator.component.Beverage;
import decorator.decorator.AddOnDecorator;

public class SoyDecorator extends AddOnDecorator {

    private Beverage beverage;

    public SoyDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 1 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + soy";
    }

}
