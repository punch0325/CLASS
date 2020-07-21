package test200702;

import java.util.Scanner;

public class D02_Example02 {

	public static void main(String[] args) {
		int number1 =0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : " );
		number1 = scan.nextInt();
		
		if (number1>=0) { 
			System.out.println("정수");
		}else if (number1<0) {
			System.out.println("음수");
		}
		
		scan.close();

	}

}
