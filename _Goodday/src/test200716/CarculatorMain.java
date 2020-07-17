package test200716;

import java.util.Scanner;

public class CarculatorMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		boolean end = true;
		
		while(end) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.���� | 3.���� | 4.������ | 5.����");
			System.out.println("-------------------------------------");
			
			System.out.print("���� > ");
			int menu = scan.nextInt();
			
			if (menu == 1) {
				cal.plus();
			}else if (menu == 2) {
				cal.minus();
			}else if (menu == 3) {
				cal.multiply();
			}else if (menu == 4) {
				cal.division();
			}else if (menu == 5){
				end = false;
				System.out.println("��� ����");
			}else {
				System.out.println("�޴� ������ �ٽ����ּ���");
			}
		
		}
	scan.close();
	
	
	}

}
