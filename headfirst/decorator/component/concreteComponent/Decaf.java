package headfirst.decorator.component.concreteComponent;

import headfirst.decorator.component.Beverage;

public class Decaf extends Beverage {

    public Decaf(String description) {
        this.setDescription(description);
    }

    @Override
    public int cost() {
        return 1100;
    }

}
