package mycode.com.loops;

public class MyLoop {

	public static void main(String args[]) {
  		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		for(int i=0,  j=0; i<=4 && j<=4; i++, j++) {
			System.out.println("*");
		}
		
		System.out.println("Y"+"O");
		System.out.println('Y'-'O');
	}
}
