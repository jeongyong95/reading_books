package headfirst.factory.pizza.type;

import java.util.logging.Logger;

import headfirst.factory.pizza.Pizza;

public class PepperoniPizza implements Pizza {
    private static Logger LOGGER = Logger.getLogger("factory");
    private static String PIZZA_TYPE = "페퍼로니피자";

    @Override
    public void prepare() {
        LOGGER.info(PIZZA_TYPE + " 준비중!");

    }

    @Override
    public void bake() {
        LOGGER.info(PIZZA_TYPE + " 굽는중!");

    }

    @Override
    public void cut() {
        LOGGER.info(PIZZA_TYPE + " 자르는중!");

    }

    @Override
    public void box() {
        LOGGER.info(PIZZA_TYPE + " 포장하는중!");

    }

}
