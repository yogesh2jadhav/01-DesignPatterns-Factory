
package mycode.com.override;

public class Derived extends Base implements myInterface {

	
	private void myBase() {
		System.out.println("I am from Derived");
	}
	
	public void myBase2() {
		System.out.println("I am from Derived my name is base2.");
	}
	
	public static void main (String arg[]) {
		Derived a = new Derived();
			//a.myBase();
			a.myBase();
	}

	@Override
	public void myInterfaceFun() {
		// TODO Auto-generated method stub
		
	}
}
