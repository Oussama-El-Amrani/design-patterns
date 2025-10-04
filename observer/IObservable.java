package observer;

public interface IObservable {
    void subscribe(Observer obs);
    void unsubscribe(Observer obs);
    void notifyObserver(Observer obs);
    void notifyAllObservers();
}
