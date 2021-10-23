package headfirst.strategy.behavior;

import java.util.logging.Logger;

public class FlyWithWings implements FlyBehavior {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void fly() {
        LOGGER.info("오리가 날아갑니다.");
    }

}
