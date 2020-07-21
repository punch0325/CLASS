package test200709;

import java.util.Scanner;

public class I05_ArrayExample4 {

	public static void main(String[] args) {
		// 배열의  값을 스캐너로 지정하여 그중에서 
		// 최댓값 출력하는 법!
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[8];
		int max = 0;
		System.out.println("숫자를 모두 입력하세요");
		
		for (int i = 0; i<num.length; i++ ) {
			num[i] = scan.nextInt();
			
			if (max<num[i]) {
				max=num[i];
			}	
		}
		
		System.out.println("최댓값 ▶ : "+max);
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
