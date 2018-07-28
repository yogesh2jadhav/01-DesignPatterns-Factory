package mycode.com.subject;

import mycode.com.observer.ObserverInterface;

public interface SubjectInterface {
	public void register(ObserverInterface newObserver);
	public void unregister(ObserverInterface deleteObserver);
	public void notifyObserver();
}
