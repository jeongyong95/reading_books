package headfirst.decorator.component.concreteComponent;

import headfirst.decorator.component.Beverage;

public class Espresso extends Beverage {

    public Espresso(String description) {
        this.setDescription(description);
    }

    @Override
    public int cost() {
        return 2000;
    }

}
