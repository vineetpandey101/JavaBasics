package oopstest;

public class MethodOverLTest {
	int a=20;
	String b="Test";
	public static void main(String[] args) {
		MethodOverLTest ml=new MethodOverLTest();
		System.out.println(ml.a);
		ml.abc();
		ml.abc(20);
		ml.abc(20, 30);

	}
	public void abc(){
		System.out.println("No orgument");
		a=50;
		System.out.println(a);

	}
	public void abc(int a){
		System.out.println("one orgument");
	}
	public void abc(int a, int b){
		System.out.println("one orgument");
	}

}
