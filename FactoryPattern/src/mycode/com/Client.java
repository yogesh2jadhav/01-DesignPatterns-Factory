package mycode.com;

public class Client {

	ComputerInterface pc = ComputerFactory.createComputer("pc");
	
	ComputerInterface server = ComputerFactory.createComputer("server");
	
}
