package mycode.com.clone;

public class ObjectClone {

	public static void main (String arg[]) throws CloneNotSupportedException {
		VarClass3 obj1 = new VarClass3();
		obj1.x=10;
		obj1.y=20;
		System.out.println("Obj1 = "+ obj1.toString());
		
		VarClass3 obj2 = (VarClass3)obj1.Clone();
		
		System.out.println("Obj2 = "+ obj2.toString()+"\n");
		obj1.x=100;
		System.out.println("Obj1 = "+ obj1.toString());
		System.out.println("Obj2 = "+ obj2.toString());

	}
}

class VarClass3 implements Cloneable{
	int x;
	int y;
	
	public Object Clone () throws CloneNotSupportedException{
		
		return super.clone();
	}

	@Override
	public String toString() {
		return "VarClass3 [x=" + x + ", y=" + y + "]";
	}
	
	
}