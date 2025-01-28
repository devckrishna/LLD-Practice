package Observer;

import Observable.StockObservable;

public class EmailSendAltertObserver implements SendAltertObserver{
    String emailId;

    public EmailSendAltertObserver(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void update(StockObservable observable) {
        System.out.println("Email alter New " + observable.getName() +" Stock Available -> " + emailId);
    }

}
