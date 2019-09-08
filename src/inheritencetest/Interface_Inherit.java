package inheritencetest;

import interfacetest.Car;

public class Interface_Inherit extends ATest implements Car {

	public static void main(String[] args) {
		
		Interface_Inherit obj1=new Interface_Inherit();
		obj1.am1();
		obj1.am2();

	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void model() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manufacturedate() {
		// TODO Auto-generated method stub
		
	}

}
