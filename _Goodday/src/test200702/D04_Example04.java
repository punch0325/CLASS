package test200702;

import java.util.Scanner;

public class D04_Example04 {

	public static void main(String[] args) {
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		num = scan.nextInt();
		
		if ((num % 2)==0) {
			System.out.println("�Է��� ���ڴ� ¦����");
		}else {
			System.out.println("�Է��� ���ڴ� Ȧ����");
		}

		scan.close();
	}

}
