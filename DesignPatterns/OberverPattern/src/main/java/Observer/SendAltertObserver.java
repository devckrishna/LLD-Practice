package Observer;

import Observable.StockObservable;

public interface SendAltertObserver {
    public void update(StockObservable observable);
}
