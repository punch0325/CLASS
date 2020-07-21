package test200702;

import java.util.Scanner;

public class D04_Example04 {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();
		
		if ((num % 2)==0) {
			System.out.println("입력한 숫자는 짝수★");
		}else {
			System.out.println("입력한 숫자는 홀수★");
		}

		scan.close();
	}

}
