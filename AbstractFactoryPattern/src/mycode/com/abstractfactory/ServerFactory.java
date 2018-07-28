package mycode.com.abstractfactory;

import mycode.com.beans.ComputerInterface;
import mycode.com.beans.Server;

public class ServerFactory implements ComputerAbstractFactory {

	
	public ServerFactory() {
		super();
		System.out.println("Constructor of mycode.com.beans.ServerFactory.");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ComputerInterface createComputer() {
		ComputerInterface com = new Server();
		return com;
	}

}
