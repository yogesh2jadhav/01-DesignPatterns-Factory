package mycode.com.observer;

import mycode.com.subject.Subject;

public class Observer implements ObserverInterface {

	int observerId ;
	Subject subject;
	
	public Observer(Subject mySubject) {
		super();
		this.subject=mySubject;
		subject.register(this);
		observerId++;
	}



	@Override
	public void update(int iPhone, int samsung) {
		// TODO Auto-generated method stub
		System.out.println("\n\nObserver Id=" +observerId+" \niPhone Qantity = "+ iPhone +" \nSamsung Qantity="+samsung);

	}

}
