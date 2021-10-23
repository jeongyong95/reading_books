package headfirst.strategy.Duck;

import java.util.logging.Logger;

import headfirst.strategy.behavior.FlyNoWay;
import headfirst.strategy.behavior.Quack;

public class ModelDuck extends Duck {

    private static final Logger LOGGER = Logger.getGlobal();

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        LOGGER.info("저는 모형 오리입니다.");
    }

}
