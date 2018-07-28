package mycode.com.test;

import mycode.com.abstractfactory.ComputerFactoryOfFactor;
import mycode.com.abstractfactory.PCFactory;
import mycode.com.beans.ComputerInterface;

public class Client {

	public Client() {
		super();
		System.out.println("Constructor of mycode.com.test.Clients");
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ComputerInterface com = ComputerFactoryOfFactor.getComputer(new PCFactory());
	}
}
