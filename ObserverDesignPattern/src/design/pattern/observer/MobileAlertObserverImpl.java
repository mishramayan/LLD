package design.pattern.observer;

import design.pattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
	
	String userName;
	StockObservable observable;
	
	public MobileAlertObserverImpl(String userName, StockObservable observable) {
		this.observable = observable;
		this.userName = userName;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMessage(userName, "product is in stock.");
	}
	
	private void sendMessage(String userName, String msg) {
		System.out.println("Message sent to: " + userName);
	}
}
