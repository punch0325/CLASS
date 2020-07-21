package test200708;

import java.util.Scanner;

public class H04_DoWhileExample04 {

	public static void main(String[] args) {
		// 초간단 ATM기 만들기~!~!~!~!~!~!~!~!
		
		Scanner scan = new Scanner(System.in);
		int bank = 0;
		int money = 0;
		int number = 0;
		boolean end = true;
		
		do {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택 ▶ ");
			number = scan.nextInt();
			
			if (number == 1) {
				System.out.print("예금액 ▶ ");
				bank = scan.nextInt();
				money+=bank;
				System.out.println("현재 잔액 "+money+"원 입니다.");
				System.out.println();
			}else if (number == 2) {
				System.out.print("출금액 ▶ ");
				bank = scan.nextInt();
				if (money<bank) {
					System.out.println("잔액이 부족합니다.");
					System.out.println();
				}else if (money>=bank) {
					money-=bank;
					System.out.println("현재 잔액 "+money+"원 입니다.");
					System.out.println();
				}
			}else if (number == 3) {
				System.out.println("현재 잔액 "+money+"원 입니다.");
				System.out.println();
			}else if (number == 4) {
				end = false;
				System.out.println("\nATM이 종료 되었습니다.");
			}else {
				System.out.println("잘못된 번호입니다. 다시 눌러주세요.");
				System.out.println();
			}
			
		}while (end);
		
		scan.close();

	}

}
