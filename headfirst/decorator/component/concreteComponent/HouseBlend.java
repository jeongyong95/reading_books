package headfirst.decorator.component.concreteComponent;

import headfirst.decorator.component.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(String description) {
        this.setDescription(description);
    }

    @Override
    public int cost() {
        return 900;
    }

}
