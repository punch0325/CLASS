package test200716;

import java.util.Scanner;

public class Ex {
	
	Scanner scan = new Scanner(System.in);
	
	int menu;
	int num1;
	int num2;
	
	void calculator() {
		boolean end = true;
		
		while (end ) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.���� | 3.���� | 4.������ | 5.����");
			System.out.println("-------------------------------------");
			
			System.out.print("���� > ");
			menu = scan.nextInt();
			
			if (menu == 1) {
				System.out.print("���� �Է� : ");
				num1 = scan.nextInt();
				System.out.print("���� �Է� : ");
				num2 = scan.nextInt();
				int sum = num1+num2;
				System.out.println("���� ��� : "+sum);
				
			}else if (menu == 2) {
				System.out.print("���� �Է� : ");
				num1 = scan.nextInt();
				System.out.print("���� �Է� : ");
				num2 = scan.nextInt();
				int minus = num1-num2;
				System.out.println("���� ��� : "+minus);
				
			}else if (menu == 3) {
				System.out.print("���� �Է� : ");
				num1 = scan.nextInt();
				System.out.print("���� �Է� : ");
				num2 = scan.nextInt();
				int multiply = num1*num2;
				System.out.println("���� ��� : "+multiply);
				
			}else if (menu == 4) {
				System.out.print("���� �Է� : ");
				num1 = scan.nextInt();
				System.out.print("���� �Է� : ");
				num2 = scan.nextInt();
				int division = num1/num2;
				System.out.println("���� ��� : "+division);
				
			}else if (menu == 5){
				end = false;
				System.out.println("��� ����");
				
			}else {
				System.out.println("�޴� ������ �ٽ����ּ���");
			
			}
		}
		
	}
	

}
