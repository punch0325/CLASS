package test200702;

public class D08_Example06 {

	public static void main(String[] args) {
		// �ֻ��� ����ϱ�

		int num = 0;
		String square = "";
		num = (int)(Math.random() * 6) + 1;
		/*���� �޼ҵ�� 0.0�̻� 1.0 �̸���
		   ���� �����ֱ� ������ 6�� ���ϸ� 0.0���� 5.0������
		   ���� ���ϰ� �ȴ� �׷��Ƿ� 1�� �����ָ� 1.0����
		  6.0������ ���� �߻� ��ų �� �ִ�. 
		  (int)�� ���� �� ��ȯ�� ���� ������ 1 ���� 6�� ��*/
		
		switch (square) {
		case "" : 
			System.out.println("�ֻ��� " + num + "��(��) ���Խ��ϴ�!");
			break;
		default :
			System.out.println("�߸� �������ϴ٤�^��");
			break;
		}
	
	
	
	
	}

}
