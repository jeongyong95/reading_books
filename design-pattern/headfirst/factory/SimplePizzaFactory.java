package headfirst.factory;

import headfirst.factory.pizza.Pizza;
import headfirst.factory.pizza.type.CheesePizza;
import headfirst.factory.pizza.type.ClamPizza;
import headfirst.factory.pizza.type.PepperoniPizza;
import headfirst.factory.pizza.type.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            default:
                pizza = new VeggiePizza();
        }
        return pizza;
    }
}
