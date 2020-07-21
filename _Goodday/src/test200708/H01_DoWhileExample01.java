package test200708;

import java.util.Scanner;

public class H01_DoWhileExample01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int result = 0;
		int count = 0;
		boolean end = true;
		System.out.println("정수를 입력 후 마지막에 0을 입력하면 종료됩니다.");
		
		
		do {
			num = scan.nextInt();
			if (num > 0) {
				result += num;
				++count; /* 반복이 한 번 돌 때 마다 계속하여
				            1씩 증가하기 때문에
				                    개수를 구할 수 있음 
				            count++;을 써도 상관 없음
				              */
			}else if (num == 0) {
				end = false;
				System.out.println("입력한 숫자의 총 개수는 "+count+"개 입니다.");
				System.out.println("총 합계 평균은 "+(result/count)+"입니다.");
			}
		}while(end);
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
