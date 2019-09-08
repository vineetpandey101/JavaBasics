package interfacetest;

public class Testinterface implements Car{

	public static void main(String[] args) {
		Testinterface ti=new Testinterface();
		ti.speed();
		ti.manufacturedate();
		ti.model();
		ti.test();

	}

	@Override
	public void speed() {
		System.out.println("120km/h");
		
	}

	@Override
	public void model() {
		System.out.println("2018");
		
	}

	@Override
	public void manufacturedate() {
		System.out.println("12 April 2017");
		
	}
	public void test(){
		System.out.println("Hello class Testinterface methoid");
	}

}
