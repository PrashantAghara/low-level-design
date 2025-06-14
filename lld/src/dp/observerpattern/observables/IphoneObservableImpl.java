package dp.observerpattern.observables;

import dp.observerpattern.observers.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {
    List<NotificationAlertObserver> observers = new ArrayList<>();
    int stocks = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCounts(int newStocks) {
        if (stocks == 0) {
            notifyObservers();
        }
        this.stocks += newStocks;
    }

    @Override
    public int getStockCount() {
        return stocks;
    }
}
