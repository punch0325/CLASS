package test200630;

import java.util.Scanner;

public class B04_Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name="";
		name = scan.nextLine();
		System.out.println("�Է��� �̸� " + name);
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String adress = "";
		adress = scan.nextLine();
		System.out.println("�Է��� �ּ� " + adress);
		
		int age = 0;
		System.out.print("���̸� �Է��ϼ��� : ");
		age = scan.nextInt();
		System.out.println("�Է��� ����" + age);
		
		scan.close();
		

		
		

	}

}
