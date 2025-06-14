package dp.observerpattern.observers;

import dp.observerpattern.observables.StockObservable;

public class MobileObserver implements NotificationAlertObserver {
    private String userName;
    private StockObservable observable;

    public MobileObserver(StockObservable observable, String userName) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(userName, "Product is available now with stock");
    }

    public void sendEmail(String userName, String message) {
        System.out.println("Message sent to : " + userName);
        System.out.println("Message : " + message);
    }
}
