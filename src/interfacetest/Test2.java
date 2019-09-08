package interfacetest;

public class Test2 implements Engine {

	@Override
	public void power() {
		System.out.println("150km/h");
		
	}

	@Override
	public void speed() {
		System.out.println("150km/hrs");
		
	}
}
