package mycode.com.run;

import mycode.com.observer.Observer;
import mycode.com.subject.Subject;

public class testObserverPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject qManager = new Subject();
		
		Observer obj1 = new Observer(qManager);
		
		qManager.setiPhone(1);
		qManager.setSumsung(2);
		
		Observer obj2 = new Observer(qManager);
		
		qManager.setiPhone(10);
		qManager.setSumsung(20);
	}

}
