package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
	
	String userName;
	StocksObservable observable;
	
	public MobileAlertObserverImpl(String userName,StocksObservable observable) {
		this.userName = userName;
		this.observable = observable;
	}
	
	
	@Override
	public void update() {
		sendMsgOnMobile(userName,"product is in stock hurry up");
		
	}


	public void sendMsgOnMobile(String userName, String string) {
		System.out.println("msg sent to: " + userName);
		
	}

}
