package test200706;

public class F02_Example02 {

	public static void main(String[] args) {
		
		// 1~100 �߿� 3�� 5�� ������� ���
		
		for (int i = 1; i<=100 ; i++) {
			if (i % 3 ==0) { //�� ������ &&�� ��� ����
				if (i % 5 ==0) {
					System.out.print(" " + i);
				}
			}
		}
		
		

		
		

	}

}
