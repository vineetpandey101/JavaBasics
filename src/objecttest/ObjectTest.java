package objecttest;

public class ObjectTest {
int a;
int b=30;
	public static void main(String[] args) {
		ObjectTest obj1=new ObjectTest();
		ObjectTest obj2=new ObjectTest();
		obj1.a=100;
		System.out.println(obj2.a);
	obj1.test1();
	int z=obj1.add(20, 30);
	System.out.println(z);
	String ss=obj1.date();
	System.out.println(ss);

	}
	public void test1(){
		System.out.println("No return");
	}
	public String date(){
		System.out.println("return Date");
		String a="31march";
		return a;
	}
	public int add(int i,int j){
		int k=i+j;
		return k;
	}

}
