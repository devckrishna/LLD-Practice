package Observable;

import Observer.SendAltertObserver;

import java.util.ArrayList;
import java.util.List;

public class iPhoneStockObservable implements StockObservable {
    List<SendAltertObserver> observers;
    String name;
    int stockCount;
    public iPhoneStockObservable() {
        this.observers = new ArrayList<>();
        this.name = "Iphone Stock";
        stockCount = 0;
    }

    @Override
    public void subscribe(SendAltertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(SendAltertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this);
        }
    }

    @Override
    public void setCount(int count) {
        if(stockCount == 0) {
            notifyObservers();
        }
        stockCount = count;
    }

    @Override
    public int getCount() {
        return stockCount;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
