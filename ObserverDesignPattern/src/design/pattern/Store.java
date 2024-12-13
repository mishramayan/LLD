package design.pattern;

import design.pattern.observable.IphoneObservableImpl;
import design.pattern.observable.StockObservable;
import design.pattern.observer.EmailAlertObserverImpl;
import design.pattern.observer.MobileAlertObserverImpl;
import design.pattern.observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockObservable iphoneStockObservable = new IphoneObservableImpl();
		
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_username", iphoneStockObservable);
		
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
		iphoneStockObservable.setStock(10);
	}

}
