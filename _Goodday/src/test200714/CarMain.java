package test200714;

public class CarMain {

	public static void main(String[] args) {
		// main class(���� Ŭ����) ���� �޼ҵ尡 ����!
		
//		1.��ü ���� ���
//		  - '��ü�� ���� Ŭ���� �̸�' ������ = new '��ü Ŭ������ ������ ����'	   
		
		Car car1 = new Car(); //Car()s�� �⺻ �����ڶ�� ��
//       - car1 : ��ü�̱⵵ �ϸ鼭 CarŬ���� Ÿ���� ����
//		 - Car Ŭ������ car1 ��ü(Object)�� ����(����)�Ͽ� 		 
//         Car Ŭ������ ������ �ִ� �ʵ带 ����� �� �ְ� ����
		
		//Car Ŭ������ ������ �ִ� color �ʵ忡 ���� ����
		car1.color = "red";
//		car1 �̶�� ���纻�� ���� ���� �����Ͽ��� ������ ������ Car Ŭ������
//		�ƹ��� ������ ����.
		
		//car1�� color �ʵ尡 ������ �ִ� �� ���
		System.out.println(car1.color);
		
		Car car2 = new Car();
		car2.color = "blue";
		System.out.println(car1.color);
		System.out.println(car2.color);
//		���� �ٸ� ��ü�� ����(����)�Ͽ��� ������ �� �ΰ��� CarŬ���� Ÿ�� ������
//		���ο��� ������ ���� �ʴ´�
		
		String var = "";
		var = car2.color;
		System.out.println(var);
		
		Car car3 = null;
		car3 = new Car();
		//car3�� ��� �ʵ尪 ���
		System.out.println(car3.color);
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.speed);
		System.out.println(car3.type);
//		CarŬ�������� �ʵ��� �ʱⰪ�� ���������� �ʴ��� ��ü�� ���� 
//		�⺻ �ʱⰪ���� ��� �ȴ�.
		
		//�Ű������� �ִ� �����ڸ� Ȱ���� ��ü ����
		Car car4 = new Car("����ġ�����");
		//
		System.out.println("����"+car4.color);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.speed);
		System.out.println(car4.type);
	}

}
