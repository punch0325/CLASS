package test200714;

import java.util.Scanner;

public class L01_Array {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = null;
//		배열의 이름만 선언해준 것
//		System.out.println(num.length);
		
		System.out.print("지정할 배열 크기");
		int size = scan.nextInt();
		num = new int[size];
		System.out.println(num.length);
		
		scan.close();

	}

}
