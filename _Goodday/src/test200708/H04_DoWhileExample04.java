package test200708;

import java.util.Scanner;

public class H04_DoWhileExample04 {

	public static void main(String[] args) {
		// �ʰ��� ATM�� �����~!~!~!~!~!~!~!~!
		
		Scanner scan = new Scanner(System.in);
		int bank = 0;
		int money = 0;
		int number = 0;
		boolean end = true;
		
		do {
			System.out.println("-------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------");
			System.out.print("���� �� ");
			number = scan.nextInt();
			
			if (number == 1) {
				System.out.print("���ݾ� �� ");
				bank = scan.nextInt();
				money+=bank;
				System.out.println("���� �ܾ� "+money+"�� �Դϴ�.");
				System.out.println();
			}else if (number == 2) {
				System.out.print("��ݾ� �� ");
				bank = scan.nextInt();
				if (money<bank) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println();
				}else if (money>=bank) {
					money-=bank;
					System.out.println("���� �ܾ� "+money+"�� �Դϴ�.");
					System.out.println();
				}
			}else if (number == 3) {
				System.out.println("���� �ܾ� "+money+"�� �Դϴ�.");
				System.out.println();
			}else if (number == 4) {
				end = false;
				System.out.println("\nATM�� ���� �Ǿ����ϴ�.");
			}else {
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �����ּ���.");
				System.out.println();
			}
			
		}while (end);
		
		scan.close();

	}

}
