package observer.classes.observers;

import observer.classes.observable.WeatherStation;
import observer.pattern_interfaces.IObserver;
import observer.pattern_interfaces.action_interfaces.IDisplay;

public class TVDisplay implements IObserver, IDisplay {
    WeatherStation weatherStation;
    int temperature = 0;

    public TVDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        temperature = weatherStation.getTemperature();
    }

    @Override
    public void display() {
        System.out.println(temperature != 0
                ? "TV displaying temperature: " + temperature + "ºC"
                : "No TV data");
    }
}
