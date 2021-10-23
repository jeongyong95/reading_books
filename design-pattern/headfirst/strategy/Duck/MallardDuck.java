package headfirst.strategy.Duck;

import java.util.logging.Logger;

import headfirst.strategy.behavior.FlyWithWings;
import headfirst.strategy.behavior.Quack;

public class MallardDuck extends Duck {

    private static final Logger LOGGER = Logger.getGlobal();

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        LOGGER.info("저는 물오리예요.");
    }

}
