package test200716;

import java.util.Scanner;

public class Calculator {


	int x;
	int y;
	Scanner scan = new Scanner(System.in);
	void plus () {
		System.out.print("���� �Է� : ");
		x = scan.nextInt();
		System.out.print("���� �Է� : ");
		y = scan.nextInt();
		int sum = x+y;
		System.out.println("���� ��� : "+sum);
	}
	
	void minus () {
		System.out.print("���� �Է� : ");
		 x = scan.nextInt();
		System.out.print("���� �Է� : ");
		 y = scan.nextInt();
		int minus = x-y;
		System.out.println("���� ��� : "+minus);
	}
	
	void multiply () {
		System.out.print("���� �Է� : ");
		x = scan.nextInt();
		System.out.print("���� �Է� : ");
		y = scan.nextInt();
		int multiply = x*y;  
		System.out.println("���� ��� : "+multiply);
	}
	
	void division () {
		System.out.print("���� �Է� : ");
		 x = scan.nextInt();
		System.out.print("���� �Է� : ");
		 y = scan.nextInt();
		int division = x/y;
		System.out.println("���� ��� : "+division);
	}
	
	
	
	
	
}
