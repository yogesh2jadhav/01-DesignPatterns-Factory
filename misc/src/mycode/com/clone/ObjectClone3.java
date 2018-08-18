package mycode.com.clone;

import java.util.ArrayList;
import java.util.List;

public class ObjectClone3 {

	public static void main(String arg[]) throws CloneNotSupportedException {
		Department obj1 = new Department();
		Student stdObj1 = new Student();
		
		obj1.name="Computer";

		
		stdObj1.name="Yogesh";
		stdObj1.rollNo=1;		
		obj1.studentList.add(stdObj1);
		
		
		stdObj1.name="Kishan";
		stdObj1.rollNo=2;
		obj1.studentList.add(stdObj1);
		
		Department obj2 = (Department) obj1.clone();
		obj1.studentList.add(stdObj1);
		System.out.println("aaaa="+obj2.studentList.size());
		 
		
	}
}

class Student implements Cloneable{
	String name;
	int rollNo;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class Department implements Cloneable{
	String name;
	List<Student> studentList = new ArrayList<Student>();

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Department myDep = new Department();
		myDep.studentList= new ArrayList<>();
		myDep.studentList.addAll(this.studentList);
		myDep.name=new String(this.name);
		return myDep;
		
 	}
	
	
}