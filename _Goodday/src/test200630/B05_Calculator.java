package test200630;

import java.util.Scanner;

public class B05_Calculator {

	public static void main(String[] args) {
		/*
		 * ������ ���� �����
		 *  - ������ ������ ����
		 *  - ���� �� ���� �Է¹޾� ������ ����� ���  
		 */
		
		int number1 , number2 =0;
		int result = 0;
		
		
		
		Scanner scanM = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		number1 = scanM.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		number2 = scanM.nextInt();
		result= number1+number2;
		System.out.print("���� ����� "+result+"�Դϴ�.");
		
		scanM.close();

		

	}

}
