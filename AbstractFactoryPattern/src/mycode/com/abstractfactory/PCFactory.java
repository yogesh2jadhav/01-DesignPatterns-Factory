package mycode.com.abstractfactory;

import mycode.com.beans.ComputerInterface;
import mycode.com.beans.PersonalComputer;

public class PCFactory implements ComputerAbstractFactory {

	public PCFactory() {
		super();
		System.out.println("Constructor of mycode.com.abstractfactory.PCFactory");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ComputerInterface createComputer() {
		// TODO Auto-generated method stub
		ComputerInterface com = new PersonalComputer();
		return com;
	}

}
