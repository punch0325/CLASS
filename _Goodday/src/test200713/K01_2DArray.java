package test200713;

public class K01_2DArray {

	public static void main(String[] args) {
		// 2�� 3�� ������ �迭
		int [][] number = new int[2][3];
		
		//number �迭�� ũ�� ���ϴ� ��
		System.out.println(number.length);
		System.out.println(number[1].length);
		
		//ũ�⸸ ������ number�迭�� ������ �� �����ϱ�
		number[0][0] = 1;
		number[0][1] = 3;
		number[0][2] = 5;
		number[1][0] = 7;
		number[1][1] = 9;
		number[1][2] = 0;
		
		//for���� �̿��Ͽ� number�迭�� ��� �� ���
		for (int i = 0; i<number.length; i++) {
			for(int j = 0; j<number[i].length; j++) {
				System.out.println("number"+i+","+j+"�� : "+number[i][j]);	
			}
		}
		
		// 3�� 3�� ������ �迭
		int[][] number1 = new int[3][3];
		System.out.println(number1); //�Ű�X
		
		//1�࿡ 1,2,3   2�࿡ 4,5,6 �� ����
		int[][] number2 = {{1,2,3},{4,5,6}};
		System.out.println(number2); //�Ű�X
		
		
		
		
		
		
		
	}

}
