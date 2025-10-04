package observer;

public class Main {
    public static void main(String[] args) {
        IObservable IObservable = new IObservableImpl();
        Observer obs1 = new ObserverImpl1();
        Observer obs2 = new ObserverImpl2(); 

        IObservable.subscribe(obs1);
        IObservable.subscribe(obs2);
        IObservable.notifyAllObservers();
    }
}