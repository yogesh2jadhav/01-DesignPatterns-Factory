package mycode.com.thiskey;

public abstract class MyBaseParent  {

	public int i=99;
	public static int staticI;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public static int getStaticI() {
		return staticI;
	}
	public static void setStaticI(int staticI) {
		MyBaseParent.staticI = staticI;
	}
	public void abc() {
		//
	}
	
}
