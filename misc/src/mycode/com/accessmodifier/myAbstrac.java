package mycode.com.accessmodifier;

public class myAbstrac extends myBaseAbstrack{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myBaseAbstrack obj1 = new myAbstrac();
		obj1.myAbstractFx();
		obj1.myFx2();
	}

	@Override
	protected void myAbstractFx() {
		// TODO Auto-generated method stub
		System.out.println("This function from my base abstract class but I override in derived class.");
	}

	public void myFx2() {
		System.out.println("This fun from derived class");
	}
}


abstract class myBaseAbstrack{
	
	public int i;
	private  int x;
	
	protected abstract void myAbstractFx() ;
	
	public void myFx2() {
		System.out.println("My Function from base class....");
	}
	
}