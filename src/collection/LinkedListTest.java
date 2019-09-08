package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Test1");
		ll.add("Test2");
		ll.add("Test3");
		System.out.println(ll);
		System.out.println(ll.get(2));
		ll.addFirst("Test");
		ll.addLast("Test4");
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		LinkedList<String> ll1=new LinkedList<String>();
		ll1.add("QTP");
		ll1.add("Selenium");
		ll1.add("Java");
		ll1.addAll(0, ll);
		System.out.println(ll1);
		//*************Print the values of LinkedList***************
		System.out.println("************Get Values by For Loop");
		for (int i=0;i<ll1.size();i++){
			System.out.print(ll1.get(i)+",");
		}
		System.out.println("");
		System.out.println("************Get Values by advance For Loop");
		for(String ss:ll1){
			System.out.print(ss+",");
		}
		System.out.println("");
		System.out.println("************Get Values by Iterator");
		Iterator<String> itr=ll1.iterator();
		while (itr.hasNext()){
			System.out.print(itr.next()+",");
		}
		System.out.println("");
		System.out.println("************Get Values by While Loop");
		int num=0;
		while(ll1.size()>num){
			System.out.print(ll1.get(num)+",");
			num++;
		}
	}

}
