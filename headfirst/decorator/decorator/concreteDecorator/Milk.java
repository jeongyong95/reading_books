package headfirst.decorator.decorator.concreteDecorator;

import headfirst.decorator.component.Beverage;
import headfirst.decorator.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    private static String CONDIMENT_NAME = "Milk";
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", " + CONDIMENT_NAME;
    }

    public int cost() {
        return this.beverage.cost() + 100;
    }
}
