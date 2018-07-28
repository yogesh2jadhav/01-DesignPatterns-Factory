package mycode.com.beans;

public class PersonalComputer implements ComputerInterface {

	public PersonalComputer() {
		super();
		System.out.println("Constructor of mycode.com.beans.PersonalComputer");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void computer() {
		// TODO Auto-generated method stub
		System.out.println("This is mycode.com.PersonalComputer class");
	}

}
