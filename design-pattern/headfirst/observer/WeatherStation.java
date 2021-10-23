package headfirst.observer;

import headfirst.observer.observer.CurrentConditionDisplay;
import headfirst.observer.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(82, 70, 31);
        weatherData.setMeasurements(70, 90, 29);
    }
}
