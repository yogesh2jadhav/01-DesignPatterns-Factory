package mycode.com.subject;

import java.util.ArrayList;

import mycode.com.observer.ObserverInterface;

public class Subject implements SubjectInterface {

	public ArrayList<ObserverInterface> observerList ;
	public ObserverInterface localObserver;
	public int iPhone, samsung;
	
	
	
	
	public int getiPhone() {
		return iPhone;
	}

	public void setiPhone(int iPhone) {
		this.iPhone = iPhone;
		notifyObserver();
	}

	public int getSumsung() {
		return samsung;
	}

	public void setSumsung(int sumsung) {
		this.samsung = sumsung;
		notifyObserver();
	}

	public Subject() {
		observerList = new ArrayList<>();
	}

	@Override
	public void register(ObserverInterface newObserver) {
		// TODO Auto-generated method stub
		observerList.add(newObserver);
		
	}

	@Override
	public void unregister(ObserverInterface deleteObserver) {
		// TODO Auto-generated method stub
		int indexOfobserver = this.observerList.indexOf(deleteObserver);
		
		this.observerList.remove(indexOfobserver);
		
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("aaa ObserverList =" +observerList.size());
		for( ObserverInterface observerloop : this.observerList) {
			observerloop.update(this.iPhone, this.samsung);
			
		}
		
	}

	

}
