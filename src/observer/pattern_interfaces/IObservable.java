package observer.pattern_interfaces;

public interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyObservers();
}
