package test200702;

import java.util.Scanner;

public class D01_Example01 {

	public static void main(String[] args) {
		
		int num1 , num2=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ��� : ");
		num1 = scan.nextInt();
		System.out.print("����2�� �Է��ϼ��� : ");
		num2 = scan.nextInt();
		
		if (num1>num2) {
			System.out.println("LARGE NUMBER "+ num1);
		}else if (num1==num2){
			System.out.println("�� ���� �����ϴ�.");
		}else {
			System.out.println("LARGE NUMBER "+ num2);
		}
		
		scan.close();

	}

}
