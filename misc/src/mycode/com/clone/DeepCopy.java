package mycode.com.clone;

public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==== Deep Copy ====");
		VarClass2 obj1 = new VarClass2();
		obj1.x=10;
		obj1.y=20;
		System.out.println("Obj1 = "+ obj1.toString());
		
		
		VarClass2 obj2 = new VarClass2();
		System.out.println("Obj2 = "+ obj2.toString() +"\n");

		obj2.x=obj1.x;
		obj2.y=obj1.y;
		obj1.x=100;
 		
		System.out.println("Obj1 = "+ obj1.toString());
		System.out.println("Obj2 = "+ obj2.toString());
		
	}

}

class VarClass2{
	public int x;
	public int y;
	@Override
	public String toString() {
		return "VarClass [x=" + x + ", y=" + y + "]";
	}
	
}