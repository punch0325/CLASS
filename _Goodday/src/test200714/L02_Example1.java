package test200714;

import java.util.Scanner;

public class L02_Example1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean end = true;
		int menuNum = 0;
		int[] studentNum = null;
		int size = 0;
		int i = 0;
		int j = 0;
		int max = 0;
		int sum = 0;
		int array = 0;
		int count = 0;
		
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.�л� �� | 2.���� �Է� | 3.���� ����Ʈ | 4.�м� | 5.���� ");
			System.out.println("-----------------------------------------------------");

			System.out.print("��ȣ ���� �� ");
			menuNum = scan.nextInt();

			if (menuNum == 1) {
				System.out.print("�л� �� �Է� : ");
				size = scan.nextInt();
				studentNum = new int[size];
				System.out.println();
			}else if (menuNum == 2) {
				for (i = 0; i < studentNum.length; i++) {
					System.out.print((i + 1) + "�� ° �л� ���� �Է� : ");
					studentNum[i] = scan.nextInt();
				}
				System.out.println();
			}else if (menuNum == 3) {
				for (i = 0; i < studentNum.length; i++) {
					System.out.println((i + 1) + "�� ° �л� ���� : " + studentNum[i]);
				}
				System.out.println();
			}else if (menuNum == 4) {
				for (i = 0; i < studentNum.length; i++) {
					sum = sum + studentNum[i];
					count++;
					if (max<studentNum[i]) {
						max = studentNum[i];
					}				
				} 
				System.out.println("�ְ� ���� : "+max);
				System.out.println("��� ���� : "+(sum/count));
				
				System.out.println("���� ���� : ");
				for (i = 0; i < studentNum.length; i++) {
					for (j = i+1; j < studentNum.length; j++) {
						if (studentNum[i]<studentNum[j]) {
							array = studentNum[i];
							studentNum[i] = studentNum[j];
							studentNum[j] = array;
						}
					}
					System.out.println(studentNum[i]);
				}
				System.out.println();
			}else if (menuNum == 5) {
				end = false;
				System.out.println("�����α׷��� �����Ͽ����ϴ١�");
			}else {
				System.out.println("��ȣ�� �߸� �����Ͽ����ϴ�. �ٽ� �����ϼ���.");
				System.out.println();
			}

		} while (end);

	}

}
