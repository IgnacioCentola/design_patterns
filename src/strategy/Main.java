package strategy;

import strategy.classes.Duck;
import strategy.strategies.displaying.DisplayAsTextBehaviour;
import strategy.strategies.flying.JetFlyingBehaviour;
import strategy.strategies.flying.NoFlyingBehaviour;
import strategy.strategies.quacking.LoudQuackingBehaviour;
import strategy.strategies.quacking.NoQuackingBehaviour;

public class Main {
    public static void main(String[] args) {
       Duck countryDuck = new Duck("Steve", new LoudQuackingBehaviour(),
               new JetFlyingBehaviour(), new DisplayAsTextBehaviour());

        showDuckInfo(countryDuck);

        Duck rubberDuck = new Duck("Nancy", new NoQuackingBehaviour(),
                new NoFlyingBehaviour(), new DisplayAsTextBehaviour());

        showDuckInfo(rubberDuck);

    }

    static void showDuckInfo(Duck duck){
        System.out.println(duck.getName() + ":");
        duck.display();
        duck.fly();
        duck.quack();
        System.out.println();
    }

}
