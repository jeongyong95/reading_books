package headfirst.strategy.behavior;

import java.util.logging.Logger;

public class FlyNoWay implements FlyBehavior {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void fly() {
        LOGGER.info("이 오리는 날 수 없습니다.");
    }

}
