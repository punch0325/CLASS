package test200709;

import java.util.Scanner;

public class I03_ArrayExample2 {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열을 선언하여
		// 값을 임의로 스캐너를 사용해 입력하고
		// 입력된 값들의 총합과 평균을 구하시오.
		
		Scanner scan = new Scanner(System.in);
		
		int[] option = new int[5];
//		System.out.println("모든 숫자를 입력하세요 : ");
//		option[0] = scan.nextInt();	
//		option[1] = scan.nextInt();
//		option[2] = scan.nextInt();
//		option[3] = scan.nextInt();
//		option[4] = scan.nextInt();
//      스캐너는 변수의 인덱스 번호를 하나 하나 지정도 가능,
//		또 for문 안에 반복도 가능함
		
		int sum = 0;
		int average = 0;
		//int count = 0;
		System.out.print("모든 숫자를 입력하세요 : ");
		for (int i = 0; i<option.length; i++) {
			option[i] = scan.nextInt();
			sum+=option[i];
			//count++;
			average = sum/option.length;
			/*전 처럼 count변수를 선언해 반복한 개수를 
			구하여서 나눠도 되지만 이미 크기 메소드가
			값을 갖고 있기 때문에 이게 더 간편함*/
			
		}
		System.out.println("총합계 : "+sum);
		System.out.println("총평균 : "+average);
		
		scan.close();
		
		

	}

}
