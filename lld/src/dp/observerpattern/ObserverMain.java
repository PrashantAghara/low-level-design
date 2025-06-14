package dp.observerpattern;

import dp.observerpattern.observables.IphoneObservableImpl;
import dp.observerpattern.observables.StockObservable;
import dp.observerpattern.observers.EmailObserver;
import dp.observerpattern.observers.MobileObserver;
import dp.observerpattern.observers.NotificationAlertObserver;

public class ObserverMain {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailObserver(iphoneObservable, "abc@gmail.com");
        NotificationAlertObserver observer2 = new MobileObserver(iphoneObservable, "abc_name");

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setStockCounts(10);
    }
}
