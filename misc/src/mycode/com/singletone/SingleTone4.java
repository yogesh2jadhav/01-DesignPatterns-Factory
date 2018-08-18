package mycode.com.singletone;

public class SingleTone4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingTone4 a = MySingTone4.getInstance();
		a.i=10;
		a.j=20;
		
		System.out.println("Object a="+ a.toString());
		MySingTone4 b = MySingTone4.getInstance();
		System.out.println("Object b="+b.toString());
		b.i=100;
		b.j=200;
		System.out.println("Object a="+ a.toString());

	}

}

class MySingTone4{
	
	
	int i,j;
	private static MySingTone4 mySingObj;
	private MySingTone4() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static MySingTone4 getInstance() {
		if(mySingObj!=null) {
			return mySingObj;
		}else {
			mySingObj = new MySingTone4();
			return mySingObj;
		}
			
		
	}

	@Override
	public String toString() {
		return "MySingTone4 [i=" + i + ", j=" + j + "]";
	}
	
	
}