import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {
		StocksObservable iphoneStocksObservable = new IphoneObservableImpl();
		
		NotificationAlertObserver observer1 = new EmailAlertObserverImpl("ashishanand.nikhil@gmail.com", iphoneStocksObservable);
		NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abhijeet.anand804@gmail.com", iphoneStocksObservable);
		NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Nikhil", iphoneStocksObservable);
		
		iphoneStocksObservable.add(observer1);
		iphoneStocksObservable.add(observer2);
		iphoneStocksObservable.add(observer3);
		
		iphoneStocksObservable.setStockCount(10);
	}

}
