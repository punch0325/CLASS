package test200709;

import java.util.Scanner;

public class I05_ArrayExample4 {

	public static void main(String[] args) {
		// �迭��  ���� ��ĳ�ʷ� �����Ͽ� ���߿��� 
		// �ִ� ����ϴ� ��!
		
		Scanner scan = new Scanner(System.in);
		int[] num = new int[8];
		int max = 0;
		System.out.println("���ڸ� ��� �Է��ϼ���");
		
		for (int i = 0; i<num.length; i++ ) {
			num[i] = scan.nextInt();
			
			if (max<num[i]) {
				max=num[i];
			}	
		}
		
		System.out.println("�ִ� �� : "+max);
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
