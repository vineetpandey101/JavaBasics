package arraytest;

public class TwoDArray {

	public static void main(String[] args) {
		Object obj[][]=new Object[3][5];
		obj[0][0]=10;
		obj[0][1]=20;
		obj[0][2]=30;
		obj[0][3]=40;
		obj[0][4]=50;
		
		obj[1][0]=60;
		obj[1][1]=70;
		obj[1][2]=80;
		obj[1][3]=90;
		obj[1][4]=100;
		
		obj[2][0]=100;
		obj[2][1]=200;
		obj[2][2]=300;
		obj[2][3]=400;
		obj[2][4]=500;
System.out.println(obj.length);
System.out.println(obj[0].length);
System.out.println(obj[0][2]);
for(int i=0;i<obj.length;i++){
	for(int j=0;j<obj[0].length;j++){
		System.out.println(obj[i][j]);
	}
}
	}

}
