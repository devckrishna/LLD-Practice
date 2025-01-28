package Observable;

import Observer.SendAltertObserver;

public interface StockObservable {
    public void subscribe(SendAltertObserver observer);

    public void unSubscribe(SendAltertObserver observer);

    public void notifyObservers();

    public String getName();

    public void setCount(int count);

    public int getCount();
}
