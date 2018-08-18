package mycode.com.clone;

public class ShallCopy {

	public static void main (String arg[]) {
		
		System.out.println("==== Shallow Copy ====");
		
		VarClass obj1 = new VarClass();
		obj1.x=10;
		obj1.y=20;
		
		System.out.println("Obj1 = " + obj1.toString());
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		VarClass obj2 = obj1;
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		System.out.println("Obj2 = " + obj2.toString() +"\n");

	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		obj1.x=100;
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		System.out.println("Obj1 = " + obj1.toString());
		System.out.println("Obj2 = "+obj2.toString());
	}
}


class VarClass{
	
	public int x;
	public int y;
	@Override
	public String toString() {
		return "VarClass [x=" + x + ", y=" + y + "]";
	}
	
	
}