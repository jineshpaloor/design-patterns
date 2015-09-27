package ObserverPattern;

/**
 * Created by jineshn on 27/09/15.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
