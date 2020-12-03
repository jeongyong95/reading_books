package headfirst.decorator.decorator.concreteDecorator;

import headfirst.decorator.component.Beverage;
import headfirst.decorator.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private static String CODIMENT_NAME = "Whip";
    private Beverage Beverage;

    public Whip(Beverage beverage) {
        this.Beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.Beverage.getDescription() + ", " + CODIMENT_NAME;
    }

    @Override
    public int cost() {
        return this.Beverage.cost() + 100;
    }
}
