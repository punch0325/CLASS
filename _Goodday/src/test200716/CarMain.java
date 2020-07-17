package test200716;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car car1 = new Car(5);
		System.out.print("가스를 주입해주세요 : ");
		int gas = scan.nextInt();
//		car1.setGas(10);
		car1.setGas(gas);
		
		boolean gasState = car1.isLeftGas();
		System.out.println(car1.gas);
		if(gasState) {
			System.out.println("출발");
			car1.run();
		}
	
	scan.close();
	
	
	
	
	
	
	}


	
}
