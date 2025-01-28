import Observable.SamsungStockObservable;
import Observable.StockObservable;
import Observable.iPhoneStockObservable;
import Observer.EmailSendAltertObserver;
import Observer.PhoneSendAltertObserver;
import Observer.SendAltertObserver;

public class CLient {
    public static void main(String[] args) {
        StockObservable iphone = new iPhoneStockObservable();
        StockObservable samsung = new SamsungStockObservable();

        SendAltertObserver devEmail = new EmailSendAltertObserver("dev@gmail.com");
        SendAltertObserver devPhone = new PhoneSendAltertObserver("12234345");
        SendAltertObserver harveyEmail = new EmailSendAltertObserver("harvey@gmail.com");

        iphone.subscribe(devEmail);
        iphone.subscribe(devPhone);
        iphone.subscribe(harveyEmail);

        samsung.subscribe(devPhone);
        samsung.subscribe(harveyEmail);

        samsung.setCount(10);
        iphone.setCount(20);
        samsung.setCount(0);
        samsung.unSubscribe(harveyEmail);
        samsung.setCount(2);
    }
}
