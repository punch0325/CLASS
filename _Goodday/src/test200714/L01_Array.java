package test200714;

import java.util.Scanner;

public class L01_Array {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = null;
//		�迭�� �̸��� �������� ��
//		System.out.println(num.length);
		
		System.out.print("������ �迭 ũ��");
		int size = scan.nextInt();
		num = new int[size];
		System.out.println(num.length);
		
		scan.close();

	}

}
