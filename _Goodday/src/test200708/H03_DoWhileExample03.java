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
			System.out.print("1 - 100 ������ ���ڸ� �Է��ϼ��� �� ");
			num = scan.nextInt();
			
			if (num>random) {
				System.out.println("��! DOWN^_^~");
				System.out.println();
			}else if (num<random){
				System.out.println("��! UP^_^~");
				System.out.println();
			}else if (num == random) {
				perfect = false;
				System.out.println("����! PERFECT^��^!");			
			}
			count++;
		}while(perfect);
		
		if (count <= 5) {		
			System.out.println("�����ؿ�!�� ���� �õ� Ƚ���� "+count+"�� �Դϴ�!");
		}else {
			System.out.println("�ƽ�����!�� ���� �õ� Ƚ���� "+count+"�� �Դϴ�!");
		}
		scan.close();
		
		
		
		
		
		
		
	}

}
