package test200707;

import java.util.Scanner;

public class G07_DoWhileExample01 {

	public static void main(String[] args) {
		//do while�� �̿��� ä�� â �����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("ä���� �������� '����'�� �Է��ϼ���");
		System.out.println();

		String chat = "";
		boolean stop = true;
		
		do {
			System.out.print("> ");
			chat = scan.nextLine();
			System.out.println(chat);
			
			if (chat.equals("����")) {
				stop = false;
				System.out.println("\nä���� ���� �Ǿ����ϴ�. �Է� �Ұ��Դϴ�.");
			}
		
		}while (stop);
	

		scan.close();
	
		
	    //���� ���� ��� ��� ����!!
//		Scanner scan = new Scanner(System.in);
//		String chat = "";
//		System.out.println("�޽����� �Է��� �� �ֽ��ϴ�.");
//		System.out.println("ä�� ���Ḧ ���ϸ� 'STOP'�� �Է��ϼ���.");
//		System.out.println();
//		
//		boolean stop = true;
//		while (stop){
//			System.out.print("> ");
//			chat = scan.nextLine();
//			System.out.println(chat);
//			
//			if (chat.equals("STOP")) {
//				stop = false;
//				System.out.println();
//				System.out.println("ä�� ����.");
//			}
//		}
	
	
	}

}
