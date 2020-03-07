package decorator.concrete_decorators;

import decorator.component.Beverage;
import decorator.decorator.AddOnDecorator;

public class CaramelDecorator extends AddOnDecorator {

    private Beverage beverage;

    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 2 + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + caramel";
    }


}
