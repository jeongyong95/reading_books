package headfirst.strategy;

import headfirst.strategy.Duck.Duck;
import headfirst.strategy.Duck.MallardDuck;
import headfirst.strategy.Duck.ModelDuck;
import headfirst.strategy.behavior.FlyRocketPowerd;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck model = new ModelDuck();
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowerd());
        model.performFly();
    }

}
