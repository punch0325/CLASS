package test200709;



public class I02_ArrayExample1 {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭�� �����Ͽ�
		// ���� ���Ƿ� �Է��ϰ�
		// �Էµ� ������ ���հ� ����� ���Ͻÿ�.
		
		int[] option = new int[5];
		option[0] = 3;
		option[1] = 6;
		option[2] = 9;
		option[3] = 12;
		option[4] = 15;
		
		int sum = 0;
		int average = 0;
		//int count = 0;
		for (int i = 0; i<option.length; i++) {
			sum+=option[i];
			//count++;
			average = sum/option.length;
			/*�� ó�� count������ ������ �ݺ��� ������ 
			���Ͽ��� ������ ������ �̹� ũ�� �޼ҵ尡
			���� ���� �ֱ� ������ �̰� �� ������*/
			
		}
		System.out.println("���հ� : "+sum);
		System.out.println("����� : "+average);
		
		
		
		

	}

}
