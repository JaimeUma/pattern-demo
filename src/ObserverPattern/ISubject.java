package ObserverPattern;

public interface ISubject {

    void register(IObserver o);

    void unregister(IObserver o);

    void notifyObservers();

}
