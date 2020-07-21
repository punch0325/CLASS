package test200708;

import java.util.Scanner;

public class H03_DoWhileExample03 {

	public static void main(String[] args) {
		
		int random = 0;
		int num = 0;
		int count = 0;
		boolean perfect = true;
		
		Scanner scan = new Scanner(System.in);
		random = (int)(Math.random()*100)+1;
		
		
		do {
			System.out.print("1 - 100 까지의 숫자를 입력하세요 ▷ ");
			num = scan.nextInt();
			
			if (num>random) {
				System.out.println("땡! DOWN^_^~");
				System.out.println();
			}else if (num<random){
				System.out.println("땡! UP^_^~");
				System.out.println();
			}else if (num == random) {
				perfect = false;
				System.out.println("정답! PERFECT^ㅁ^!");			
			}
			count++;
		}while(perfect);
		
		if (count <= 5) {		
			System.out.println("축하해요!♥ 정답 시도 횟수가 "+count+"번 입니다!");
		}else {
			System.out.println("아쉬워요!★ 정답 시도 횟수가 "+count+"번 입니다!");
		}
		scan.close();
		
		
		
		
		
		
		
	}

}
