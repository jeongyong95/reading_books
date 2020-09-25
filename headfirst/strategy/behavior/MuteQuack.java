package headfirst.strategy.behavior;

import java.util.logging.Logger;

public class MuteQuack implements QuackBehavior {

    private static final Logger LOGGER = Logger.getGlobal();

    @Override
    public void quack() {
        LOGGER.info("~~~~조용~~~~");
    }

}
