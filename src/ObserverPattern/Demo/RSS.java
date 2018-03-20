package ObserverPattern.Demo;

import ObserverPattern.ISubject;
import ObserverPattern.IObserver;

import java.util.Collection;
import java.util.ArrayList;

public class RSS implements ISubject {

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

    private String header;

    public RSS() {
        observers = new ArrayList<IObserver>();
    }

    public void addHeader(String newHeader) {
        header = newHeader;
        notifyObservers();
    }

    public String getHeader() {
        return header;
    }
}
