package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

	String emailId;
	StocksObservable observable;
	
	public EmailAlertObserverImpl(String emailId,StocksObservable observable) {
		this.emailId = emailId;
		this.observable = observable;
	}
	
	
	
	@Override
	public void update() {
		sendMail(emailId,"product is in stock hurry up");
		
	}



	public void sendMail(String emailId2, String string) {
		System.out.println("mail sent to:" + emailId);
		
	}

}
