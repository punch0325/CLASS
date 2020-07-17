package test200716;

import java.util.Scanner;

public class Calculator {


	int x;
	int y;
	Scanner scan = new Scanner(System.in);
	void plus () {
		System.out.print("¼ýÀÚ ÀÔ·Â : ");
		x = scan.nextInt();
		System.out.print("¼ýÀÚ ÀÔ·Â : ");
		y = scan.nextInt();
		int sum = x+y;
		System.out.println("µ¡¼À °á°ú : "+sum);
	}
	
	void minus () {
		System.out.print("¼ýÀÚ ÀÔ·Â : ");
		 x = scan.nextInt();
		System.out.print("¼ýÀÚ ÀÔ·Â : ");
		 y = scan.nextInt();
		int minus = x-y;
		System.out.println("µ¡¼À °á°ú : "+minus);
	}
	
	void multiply () {
		System.out.print("¼ýÀÚ ÀÔ·Â : ");
		x = scan.nextInt();
		System.out.print("¼ýÀÚ ÀÔ·Â : ");
		y = scan.nextInt();
		int multiply = x*y;  
		System.out.println("µ¡¼À °á°ú : "+multiply);
	}
	
	void division () {
		System.out.print("¼ýÀÚ ÀÔ·Â : ");
		 x = scan.nextInt();
		System.out.print("¼ýÀÚ ÀÔ·Â : ");
		 y = scan.nextInt();
		int division = x/y;
		System.out.println("µ¡¼À °á°ú : "+division);
	}
	
	
	
	
	
}
