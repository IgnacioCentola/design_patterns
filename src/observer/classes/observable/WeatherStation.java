package observer.classes.observable;

import observer.classes.FakeDataSource;
import observer.pattern_interfaces.IObservable;
import observer.pattern_interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

    private List<IObserver> observers = new ArrayList<>();

    public int getTemperature() {
        return FakeDataSource.getTemperature();
    }

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
        notifyObservers();
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }
}
