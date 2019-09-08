package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String [] Orgs){
		ArrayList obj1=new ArrayList();
		obj1.add(12345);
		obj1.add('V');
		obj1.add("jhgjjgj");
		obj1.add(123.123);
		//===============Print values through For Loop================================
		int listsize=obj1.size();
		for(int i=0;i<listsize;i++){
			System.out.println("Values of array is:"+obj1.get(i));
		}
		//==================Pring values throgh Foreach loop=============================
		for(Object abc:obj1){
			System.out.println(abc);
			
		}
		//===========================Print values through iterator==========
		Iterator itr=obj1.iterator();
		while(itr.hasNext()){
			Object alname=itr.next();
			System.out.println("Values are"+alname);
		}
		Employee emp1=new Employee("Vineet",30,"QA");
		Employee emp2=new Employee("Ankur",24,"QA");
		Employee emp3=new Employee("Ankit",28,"QA");
	
		ArrayList<Employee> ar1=new ArrayList<Employee>();
		ar1.add(emp1);
		ar1.add(emp2);
		ar1.add(emp3);
		System.out.println("Values of employee table");
		Iterator<Employee> itr1=ar1.iterator();
		while(itr1.hasNext()){
			Employee emp=itr1.next();
			System.out.println(emp.empname);
			System.out.println(emp.age);
			System.out.println(emp.department);
		}
		
	}

}
