package test200709;

import java.util.Scanner;

public class I03_ArrayExample2 {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭�� �����Ͽ�
		// ���� ���Ƿ� ��ĳ�ʸ� ����� �Է��ϰ�
		// �Էµ� ������ ���հ� ����� ���Ͻÿ�.
		
		Scanner scan = new Scanner(System.in);
		
		int[] option = new int[5];
//		System.out.println("��� ���ڸ� �Է��ϼ��� : ");
//		option[0] = scan.nextInt();	
//		option[1] = scan.nextInt();
//		option[2] = scan.nextInt();
//		option[3] = scan.nextInt();
//		option[4] = scan.nextInt();
//      ��ĳ�ʴ� ������ �ε��� ��ȣ�� �ϳ� �ϳ� ������ ����,
//		�� for�� �ȿ� �ݺ��� ������
		
		int sum = 0;
		int average = 0;
		//int count = 0;
		System.out.print("��� ���ڸ� �Է��ϼ��� : ");
		for (int i = 0; i<option.length; i++) {
			option[i] = scan.nextInt();
			sum+=option[i];
			//count++;
			average = sum/option.length;
			/*�� ó�� count������ ������ �ݺ��� ������ 
			���Ͽ��� ������ ������ �̹� ũ�� �޼ҵ尡
			���� ���� �ֱ� ������ �̰� �� ������*/
			
		}
		System.out.println("���հ� : "+sum);
		System.out.println("����� : "+average);
		
		scan.close();
		
		

	}

}
