package test200715;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.sum(100, 100);
		
		int val1 = 100;
		int val2 = 20;
		cal.sum(val1, val2);
//�Ű����� ���� Ŭ�������� ������ ������ �� �� ������ �޼ҵ忡�� ������ Ÿ�԰� ���ƾ� �� 
		
		cal.sum0(5, 15);
//cal.sum �޼ҵ�� Ŭ�������� ��±��� �޼ҵ�� �����߱� ������ 
//�ٷ� ����� �Ǿ����� cal.sum0�� ���ϸ� �� ���¶� �ڵ� ����� ���� ����
//cal.sum0��ü�� 20�� �� ��
		
		int see = cal.sum0(5, 15);
		System.out.println(see);
		

		


	}

}
