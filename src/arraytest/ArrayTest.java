package arraytest;

public class ArrayTest {

	public static void main(String[] args) {
		int a[]=new int[5];
		double b[]=new double[5];
		a[1]=10;
		b[1]=10.5;
		//System.out.println(a[1]);
		Object obj[]=new Object[5];
		for(int i=0;i<5;i++){
		int j=10;
		int k=++j;
		obj[i]=k;
		System.out.println(obj[i]);
		System.out.println(obj.length);
		}
		
		

	}

}
