package headfirst.decorator.component.concreteComponent;

import headfirst.decorator.component.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(String description) {
        this.setDescription(description);
    }

    @Override
    public int cost() {
        return 1000;
    }

}
