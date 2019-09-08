package oopstest;

public class Wrapperclasstest {

	public static void main(String[] args) {
		String s="100";
		String s1="10.55";
		String s2="500a";
		int a1=Integer.parseInt(s2);//NumberFormatException will show.
		System.out.println(a1);
		double d1=Double.parseDouble(s1);
		System.out.println(d1);
		int a=50;
		System.out.println(s+a);
		int b=Integer.parseInt(s);
		System.out.println(b+a);

	}

}
