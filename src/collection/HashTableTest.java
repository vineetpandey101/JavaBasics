package collection;

import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		int i;
	//Create Hashtable.
	for(i=1;i<=50;i++){
		h.put(i, "Test"+i);
	}
		for(i=1;i<=50;i++){
			System.out.println(h.get(i));
		}
	}

}
