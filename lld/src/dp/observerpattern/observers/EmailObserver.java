package dp.observerpattern.observers;

import dp.observerpattern.observables.StockObservable;

public class EmailObserver implements NotificationAlertObserver {
    private String emailId;
    private StockObservable observable;

    public EmailObserver(StockObservable observable, String emailId) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Product is available now with stock");
    }

    public void sendEmail(String emailId, String message) {
        System.out.println("Sent the email to : " + emailId);
        System.out.println("Message : " + message);
    }
}
