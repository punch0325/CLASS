package test200715;

public class Calculator1 {
	//�޼ҵ� �̸� : add , ����Ÿ�� : int , �Ű����� : ���� x y
	int add (int x, int y) {
		int result = x + y;
		return result;
	}
		
	double avg (int x , int y) {
		double sum = add(x,y); //���� Ŭ���� �ȿ� �ֱ� ������ �̸������ε� ȣ���� ����
		double result = sum / 2;
		return result;
		
	}

	void execute() {
		double result = avg(7,10);
		System.out.println("������" + result);
	}














}
