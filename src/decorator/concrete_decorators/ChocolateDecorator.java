package decorator.concrete_decorators;

import decorator.component.Beverage;
import decorator.decorator.AddOnDecorator;

public class ChocolateDecorator extends AddOnDecorator {
    private Beverage beverage;

    public ChocolateDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 3 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + chocolate";
    }
}
