package ifelsetest;

import java.rmi.server.SocketSecurityException;

public class IfElseTest {

	public static void main(String[] args) {
		int a=250;
		int b=200;
		int c=300;
		if(a>b & a>c){
			System.out.println("A is the largest number");
		}
		else if (b>c){
			System.out.println("B is the largest Number");
		}
		else{
			System.out.println("C is the larget number");
		}
				

	}

}
