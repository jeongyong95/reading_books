package headfirst.strategy.behavior;

import java.util.logging.Logger;

public class FlyRocketPowerd implements FlyBehavior {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void fly() {
        LOGGER.info("로켓 추진으로 날아갑니다!");
    }

}
