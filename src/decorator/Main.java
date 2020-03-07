package decorator;

import decorator.component.Beverage;
import decorator.concrete_components.Espresso;
import decorator.concrete_components.Latte;
import decorator.concrete_decorators.CaramelDecorator;
import decorator.concrete_decorators.ChocolateDecorator;
import decorator.concrete_decorators.SoyDecorator;
import decorator.decorator.AddOnDecorator;

public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        Beverage latte = new Latte();
        AddOnDecorator caramelDecorator =
                new CaramelDecorator(new ChocolateDecorator(espresso));

        AddOnDecorator soyDecorator =
                new SoyDecorator(new ChocolateDecorator(latte));


        printBeverage(caramelDecorator);
        printBeverage(soyDecorator);
    }

    static public void printBeverage(Beverage beverage) {
        System.out.println(beverage.getDescription()
                + ": $" +
                beverage.getCost());
    }
}
