package test200702;

import java.util.Scanner;

public class D03_Example03 {

	public static void main(String[] args) {
		int num1 =0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num1 = scan.nextInt();
		
		if (num1 >=0) {
			System.out.println("���밪 : "+num1);
		}else {
			System.out.println("���밪 : "+(-num1));
		}
		

		scan.close();
	}

}
