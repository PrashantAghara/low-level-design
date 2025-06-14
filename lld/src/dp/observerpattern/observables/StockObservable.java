package dp.observerpattern.observables;

import dp.observerpattern.observers.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifyObservers();
    void setStockCounts(int newStocks);
    int getStockCount();
}
