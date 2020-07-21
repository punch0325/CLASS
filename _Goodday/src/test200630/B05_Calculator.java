package test200630;

import java.util.Scanner;

public class B05_Calculator {

	public static void main(String[] args) {
		/*
		 * 간단한 계산기 만들기
		 *  - 덧셈만 가능한 계산기
		 *  - 정수 두 개를 입력받아 덧셈한 결과를 출력  
		 */
		
		int number1 , number2 =0;
		int result = 0;
		
		
		
		Scanner scanM = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		number1 = scanM.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		number2 = scanM.nextInt();
		result= number1+number2;
		System.out.print("덧셈 결과는 "+result+"입니다.");
		
		scanM.close();

		

	}

}
