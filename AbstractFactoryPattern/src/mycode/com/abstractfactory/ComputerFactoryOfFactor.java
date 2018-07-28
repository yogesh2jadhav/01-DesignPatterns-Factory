package mycode.com.abstractfactory;

import mycode.com.beans.ComputerInterface;

public class ComputerFactoryOfFactor {

	
	public ComputerFactoryOfFactor() {
		super();
		System.out.println("Constructor of mycode.abstractfactor.ComputerFactoryOfFactor.");
		// TODO Auto-generated constructor stub
	}

	public static ComputerInterface getComputer(ComputerAbstractFactory CAF) {
		return CAF.createComputer();
	}
}
