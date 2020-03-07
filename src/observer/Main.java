package observer;

import observer.classes.observable.WeatherStation;
import observer.classes.observers.PhoneDisplay;
import observer.classes.observers.TVDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
        TVDisplay tvDisplay = new TVDisplay(weatherStation);

        weatherStation.add(phoneDisplay);
        weatherStation.add(tvDisplay);

        phoneDisplay.display();
        tvDisplay.display();

        weatherStation.remove(tvDisplay);

        phoneDisplay.display();
        tvDisplay.display();
    }

}
