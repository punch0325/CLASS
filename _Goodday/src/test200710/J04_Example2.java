package test200710;

import java.util.Scanner;

public class J04_Example2 {

	public static void main(String[] args) {
		// �Ž����� ���� ���� ��������-��^_^��
		
		Scanner scan = new Scanner(System.in);
		
		int wallet[] = {500,100,50,10};
		int money = 0;
		int value = 0;
		int remainder = 0;
		boolean end = true;
		
		
//		System.out.print("�Ž��� ���� �Է��ϼ��� : ");
//		money = scan.nextInt();
//		
//		value = money / wallet[0];
//		remainder = money % wallet[0];
//		System.out.println(wallet[0]+"�� ���� "+value+"��");
//		
//		value = remainder / wallet[1];
//		remainder = remainder % wallet[1];
//		System.out.println(wallet[1]+"�� ���� "+value+"��");
//		
//		value = remainder / wallet[2];
//		remainder = remainder % wallet[2];
//		System.out.println(wallet[2]+"�� ���� "+value+"��");
//		
//		value = remainder / wallet[3];
//		remainder = remainder % wallet[3];
//		System.out.println(wallet[3]+"�� ���� "+value+"��");
//		
		
		while(end) {
			System.out.print("�Ž��� ���� �Է��ϼ��� : ");
			money = scan.nextInt();
			if (money==0) {
				end = false;
				System.out.println("��� ��-��-!��");
			}else {
				for (int i = 0; i<wallet.length; i++) {
					value = money / wallet[i];
					remainder = money % wallet[i];
					System.out.println(wallet[i]+"�� ���� "+value+"��");
					money = remainder;
				}System.out.println();
			}
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
