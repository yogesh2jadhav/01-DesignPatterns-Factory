package mycode.com.singletone;

final class mySingle{
	int i =10;
	public static mySingle myIns ;
	
	private  mySingle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static mySingle getInstace() {
		if (myIns==null) {
			myIns = new mySingle();
		}
		return myIns;
	}
	
}

public class SingleTone3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mySingle a  = mySingle.getInstace();
		a.i=100;
		mySingle b  = mySingle.getInstace();

		System.out.println("==="+a.i +"|||" +b.i);
	}

}
