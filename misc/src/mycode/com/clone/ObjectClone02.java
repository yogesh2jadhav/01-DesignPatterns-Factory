package mycode.com.clone;

public class ObjectClone02 {

	public static void main (String arg[]) throws CloneNotSupportedException {
		
		myClone a = new myClone();
		a.i=10;
		a.j=20;
		System.out.println("Obect a = "+ a.toString() +"\n");
		
		myClone b = (myClone) a.Clone();
		a.i=100;
		System.out.println("Obect a = "+ a.toString());
		System.out.println("Obect b = "+ b.toString());

		
		
	}
}

class myClone implements Cloneable{
	
	int j;
	int i;
	
	
	public Object Clone () throws CloneNotSupportedException {
		
		
		return super.clone();
		
	}


	@Override
	public String toString() {
		return "myClone [j=" + j + ", i=" + i + "]";
	}
	
	
}