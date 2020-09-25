package headfirst.observer.observer;

import java.util.logging.Logger;

import headfirst.observer.subject.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private static final Logger LOGGER = Logger.getGlobal();

    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        LOGGER.info("현재 기온 : " + temperature + "F, " + "습도 : " + humidity + "%");
    }

}
