package test200702;

import java.util.Scanner;

public class D02_Example02 {

	public static void main(String[] args) {
		int number1 =0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : " );
		number1 = scan.nextInt();
		
		if (number1>=0) { 
			System.out.println("����");
		}else if (number1<0) {
			System.out.println("����");
		}
		
		scan.close();

	}

}
