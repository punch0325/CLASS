package test200708;

import java.util.Scanner;

public class H01_DoWhileExample01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int result = 0;
		int count = 0;
		boolean end = true;
		System.out.println("������ �Է� �� �������� 0�� �Է��ϸ� ����˴ϴ�.");
		
		
		do {
			num = scan.nextInt();
			if (num > 0) {
				result += num;
				++count; /* �ݺ��� �� �� �� �� ���� ����Ͽ�
				            1�� �����ϱ� ������
				                    ������ ���� �� ���� 
				            count++;�� �ᵵ ��� ����
				              */
			}else if (num == 0) {
				end = false;
				System.out.println("�Է��� ������ �� ������ "+count+"�� �Դϴ�.");
				System.out.println("�� �հ� ����� "+(result/count)+"�Դϴ�.");
			}
		}while(end);
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
