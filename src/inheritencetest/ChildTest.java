package inheritencetest;

public class ChildTest {

	public static void main(String[] args) {
		BTest bobj=new BTest();
		bobj.am1();
		bobj.am2();
		bobj.bm1();
		ATest aobj=new ATest();
		aobj.am1();
		aobj.am2();
		ATest obj=new BTest();
		obj.am1();
		obj.am2();

	}

}
