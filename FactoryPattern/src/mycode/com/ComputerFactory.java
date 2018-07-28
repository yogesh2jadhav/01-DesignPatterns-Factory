package mycode.com;

public  class ComputerFactory {

	public static ComputerInterface createComputer(String type) {
	
		ComputerInterface com = null; 
		switch (type){
		case "pc":
			//sdsd
			com = new PersonalComputer();
			System.out.println("Computer factory - PC");
			break;
		case "Server":
			//sdsd
			 com = new Server();
			System.out.println("Computer factory - Server");
			break;
		}
		return com;
	}
}
