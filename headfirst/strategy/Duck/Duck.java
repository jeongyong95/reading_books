package headfirst.strategy.Duck;

import java.util.logging.Logger;

import headfirst.strategy.behavior.FlyBehavior;
import headfirst.strategy.behavior.QuackBehavior;

/**
 * Duck
 */
public abstract class Duck {

    private static final Logger LOGGER = Logger.getGlobal();

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        LOGGER.info("모든 오리는 헤엄을 칠 수 있습니다.");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}