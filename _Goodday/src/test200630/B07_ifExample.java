package test200630;

import java.util.Scanner;

public class B07_ifExample {

	public static void main(String[] args) {
		/* ���� ����ϱ�
		 * �ڹ� ������ 60�� �̻��̸� "�հ��߽��ϴ�." ���
		 * 60�� �̸��̸� "���հ� �߽��ϴ�." ���
		 */
		int num1 =0;
		num1=90;
		
		if(num1>=60) {
			System.out.println("�հ��߽��ϴ�.");
		}else {
			System.out.println("���հ��߽��ϴ�.");
		}
		
		//Ʈ���� ���� ����
		Scanner scan1 = new Scanner(System.in);
		
		int score = 0;
		
		System.out.print("\n������ �Է��ϼ��� : ");
		score = scan1.nextInt();
		if(score<=60) {
			System.out.println("F�����Դϴ�.");
		}else if(score>=60&&score<70) {
			System.out.println("D�����Դϴ�.");
		}else if(score>=70&&score<80) {
			System.out.println("C�����Դϴ�.");
		}else if(score>=80&&score<90) {
			System.out.println("B�����Դϴ�.");
		}else if(score>=90&&score<=100){
			System.out.println("A�����Դϴ�.");
		}else {
			System.out.println("�Է� ������ �ʰ��Ͽ����ϴ�.");
		}
			
		
		//�� ó�� �ص� �ǰ� �� ó�� �ص� ��
		System.out.print("\n������ �Է��ϼ��� : ");
		score = scan1.nextInt();
		if(score>100) {
			System.out.println("���� �Է� ������ �ʰ��Ͽ����ϴ�.");
		}
		else if(score>=90) {
			System.out.println("A�����Դϴ�.");
		}else if(score>=80) {
			System.out.println("B�����Դϴ�.");
		}else if(score>=70) {
			System.out.println("C�����Դϴ�.");
		}else if(score>=60) {
			System.out.println("D�����Դϴ�.");
		}else {
			System.out.println("F�����Դϴ�.");
		}
		
		scan1.close();
		
	 
		
		

	}

}
