package test200707;

import java.util.Scanner;

public class G08_DoWhileExample02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean stop = true;

		do {
			System.out.print("숫자를 입력하세요 ▷ ");
			num = scan.nextInt();

			if (num == 0) {
				stop = false;
				System.out.println("종료! 입력 불가 입니다♬");
			}else if ((num % 2) == 0) {
				System.out.println("짝수♥");
				System.out.println();
			}else if ((num % 2) != 0) {
				System.out.println("홀수★");	
				System.out.println();
			}
		} while (stop);

		scan.close();
		
	}

}
