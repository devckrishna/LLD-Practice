package Observer;

import Observable.StockObservable;

public class PhoneSendAltertObserver implements SendAltertObserver{
    String phone;

    public PhoneSendAltertObserver(String phone) {

        this.phone = phone;
    }

    @Override
    public void update(StockObservable observable) {
        System.out.println("Phone Alert New " + observable.getName() +" Stock Available -> " + phone);
    }
}
