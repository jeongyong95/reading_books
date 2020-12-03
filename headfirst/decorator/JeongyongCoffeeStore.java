package headfirst.decorator;

import java.util.logging.Logger;

import headfirst.decorator.component.Beverage;
import headfirst.decorator.component.concreteComponent.HouseBlend;
import headfirst.decorator.decorator.concreteDecorator.Milk;
import headfirst.decorator.decorator.concreteDecorator.Whip;

public class JeongyongCoffeeStore {
    private static Logger LOGGER = Logger.getLogger("decorator");

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend("정용이의 커피");
        LOGGER.info(beverage.getDescription());
        LOGGER.info(String.valueOf(beverage.cost()));

        beverage = new Milk(beverage);
        LOGGER.info("우유 추가");
        LOGGER.info(beverage.getDescription());
        LOGGER.info(String.valueOf(beverage.cost()));

        for (int i = 0; i < 10; i++) {
            beverage = new Whip(beverage);
        }
        LOGGER.info("휘핑크림 1o번 추가");
        LOGGER.info(beverage.getDescription());
        LOGGER.info(String.valueOf(beverage.cost()));
    }
}
