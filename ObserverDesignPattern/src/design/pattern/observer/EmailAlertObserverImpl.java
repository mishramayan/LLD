package design.pattern.observer;

import design.pattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

	String emailId;
	StockObservable observable;
	
	public EmailAlertObserverImpl(String emailId, StockObservable observable) {
		this.observable = observable;
		this.emailId = emailId;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMail(emailId, "product is in stock.");
	}
	
	private void sendMail(String emailId, String msg) {
		System.out.println("Email sent to: " + emailId);
	}
	
}
