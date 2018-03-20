package ObserverPattern;

import java.util.Collection;

public class ConcreteSubject implements ISubject {

    Collection<IObserver> observers;

    @Override
    public void register(IObserver o) {
        observers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
