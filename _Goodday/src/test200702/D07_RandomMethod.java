package test200702;

public class D07_RandomMethod {

	public static void main(String[] args) {
		/* Random �޼ҵ�
		   Ư�� ���� ������ ���� �ϳ��� ������ִ� �޼ҵ�*/
		
		// 1~10 ������ ���� �ϳ� �߻���Ű��
		int num = 0;
		num = (int)(Math.random() * 10 ) + 1;
		/*Math��� Ŭ������ ������ �ִ� random�̶�� �޼ҵ�
		  -random �޼ҵ�� 0.0���ٴ� ũ�ų� ����,
		   1.0���ٴ� ���� ���ڸ� �߻� ��Ŵ*/
		/*(int)�� double Ÿ�� (�Ǽ���)�� ������ ��ȯ��
		    �����شٴ� �� ��ȯ�� ����*/
		System.out.println("��¼��� " + num);
		
		
		
		
	}

}
