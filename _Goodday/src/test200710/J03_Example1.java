package test200710;

import java.util.Scanner;

public class J03_Example1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("{ 9, 10, 11, 77, -1, 3, -19, 2, 4, 143 }");
		
		int[] num = {9,10,11,77,-1,3,-19,2,4,143};
		int compare = 0;
		System.out.print("위의 숫자 중 한가지를 입력하세요 : ");
		compare= scan.nextInt();
		
		for (int i = 0; i<num.length; i++) {
			
			if (compare == num[i]) {
				i++;
				System.out.println(compare+"는"+i+"번째에 있습니다.");
			}
		}
	
		scan.close();
	

		
	}

}
