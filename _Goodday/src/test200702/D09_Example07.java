package test200702;

import java.util.Scanner;

public class D09_Example07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String dictionary = "";
		dictionary = "";
		System.out.print("�ܾ �Է��ϼ��� : ");
		dictionary = scan.nextLine();
		
		switch (dictionary) {
		case "desk" :
			System.out.println("'å��'�̶�� ���Դϴ�.");
			break;
		case "chair" :
			System.out.println("'����'��� ���Դϴ�.");
			break;
		case "wallet" :
			System.out.println("'����'�̶�� ���Դϴ�.");
			break;
		case "book" :
			System.out.println("'å'�̶�� ���Դϴ�.");
			break;
		default :
			System.out.println("ã�� �� �����ϴ�.");
			break;
		}
		
       scan.close();

	}

}
