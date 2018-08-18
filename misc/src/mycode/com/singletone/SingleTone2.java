package mycode.com.singletone;

public class SingleTone2 {
	public  int i;
	private static SingleTone2 singleToneObj;
	private SingleTone2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static SingleTone2 getInstatace() {
		if(singleToneObj==null)
			singleToneObj=new SingleTone2();
		
		return singleToneObj;
	}

	public  int getI() {
		System.out.println("==== i ="+i);
		return i;
	}

	public  void setI(int i) {
		this.i = i;
	}
	
	
	
}

class runner {
	public static void main(String a[]){
		SingleTone2 myObjClass = SingleTone2.getInstatace();
		myObjClass.i=100;
		myObjClass.getI();
		
		SingleTone2 myObjClass2 = SingleTone2.getInstatace();
		myObjClass2.getI();
		
	}
}