package mycode.com.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

 
public class IteratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList intArr = new ArrayList<>();
		
		intArr.add(1);
		intArr.add(2);
		intArr.add(3);		
		intArr.add(-4);
		intArr.add(53);
		intArr.add(8883);
		
		Iterator itArr = intArr.iterator();
		int i=0;
		NumberFormat numberFrm = new DecimalFormat("000");
 		while(itArr.hasNext()) {
 			int x = (int) itArr.next();
			System.out.println("Array of ["+i+"]="+ numberFrm.format(x));
			
			i++;
		}
		
	}

}
