package test200713;


import java.util.Scanner;

public class K03_2DArrayEx2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] question = {{"chair","����"},
				               {"desk","å��"},
				               {"water","��"},
				               {"pencil","����"},
				               {"watch","�ð�"}};
		                      // 5�� 2�� ũ���� 2�� �迭
		String answer = "";
		double count = 0;
		double percent = 0;
		
		for (int i = 0; i<question.length; i++) {
			System.out.print("����"+(i+1)+". "+question[i][0]+"�� ���� �����ϱ�� ? ");
			answer = scan.nextLine();
			
			if (question[i][1].equals(answer)) {
				System.out.println("�����Դϴ�!");
				count++;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.println("������ "+question[i][1]+"�Դϴ�.");
			}
			
		}
		percent = 100 * (count/question.length);
		System.out.println();
		System.out.println("�� "+count+"�� ������ϴ٢�");
		System.out.println("������� "+percent+"% �Դϴ�!");
		
		
//		System.out.print("����1. chair�� ���� �����ΰ���? ");
//		answer = scan.nextLine();
//		if (answer.equals("����")) {
//			System.out.println("�����Դϴ�!");
//		}else {
//			System.out.println("Ʋ�Ƚ��ϴ�.");
//			System.out.println("������ ���� �Դϴ�.");
//		}
//		
//		System.out.print("����2. desk�� ���� �����ΰ���? ");
//		answer = scan.nextLine();
//		if (answer.equals("å��")) {
//			System.out.println("�����Դϴ�!");
//		}else {
//			System.out.println("Ʋ�Ƚ��ϴ�.");
//			System.out.println("������ å�� �Դϴ�.");
//		}
//		
//		System.out.print("����3. water�� ���� �����ΰ���? ");
//		answer = scan.nextLine();
//		if (answer.equals("��")) {
//			System.out.println("�����Դϴ�!");
//		}else {
//			System.out.println("Ʋ�Ƚ��ϴ�.");
//			System.out.println("������ �� �Դϴ�.");
//		}
//		
//		System.out.print("����4. pencil�� ���� �����ΰ���? ");
//		answer = scan.nextLine();
//		if (answer.equals("����")) {
//			System.out.println("�����Դϴ�!");
//		}else {
//			System.out.println("Ʋ�Ƚ��ϴ�.");
//			System.out.println("������ ���� �Դϴ�.");
//		}
//		
//		System.out.print("����5. watch�� ���� �����ΰ���? ");
//		answer = scan.nextLine();
//		if (answer.equals("�ð�")) {
//			System.out.println("�����Դϴ�!");
//		}else {
//			System.out.println("Ʋ�Ƚ��ϴ�.");
//			System.out.println("������ �ð� �Դϴ�.");
//		}
//		
//		
		
		
		scan.close();
		
		
		
		
		
	}

}
