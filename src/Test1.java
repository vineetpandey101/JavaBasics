
public class Test1 {

	public static void main(String[] args) {
		
Test1 obj=new Test1();
obj.age(20);
obj.age(15);

	}
	public boolean age(int a){
		if(a>=18){
			System.out.println("Valid candidate for votting");
			return true;
		}
		else{
			System.out.println("Not Valid candidate for votting");
			return false;
		}
		
	}
	public void table(int x){
		System.out.println("Table of "+x+ "is:");
		for (int i=1;i<=10;i++){
			int p= x*i;
			System.out.println(p+"/n");
		}
		
	}

}
