package headfirst.decorator.decorator.concreteDecorator;

import headfirst.decorator.component.Beverage;
import headfirst.decorator.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private static String CONDIMENT_NAME = "Soy";
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "," + CONDIMENT_NAME;
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 150;
    }
}
