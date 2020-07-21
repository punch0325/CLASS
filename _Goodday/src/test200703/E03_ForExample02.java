package test200703;

import java.util.Scanner;

public class E03_ForExample02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		System.out.print("※더하기 시-!작-! : ");
		num1 = scan.nextInt();
		System.out.print("※더하기 끄-!읕-! : ");
		num2 = scan.nextInt();
	
		if (num1<num2) {
		 for (int i = num1; i <= num2 ; i++) {
			sum +=i;
			
			if (i<num2&&i>=0) {
				System.out.print(i);
				System.out.print("+");			
			}else if (i<0) {
				System.out.print("("+i+")"+"+");
			}else {
				System.out.print(i);
				System.out.print("=");
			}
			
		 }System.out.println(sum);
		 System.out.println(num1+"부터"+num2+"까지의 합은"+sum+"입니다.");
		}else {
			System.out.println("시작 값 오류");
		}
		
		scan.close();
		
		
	}

}
