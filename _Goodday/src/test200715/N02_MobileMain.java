package test200715;

public class N02_MobileMain {

	public static void main(String[] args) {
		
		Mobile mobile1 = new Mobile();
		mobile1.company = "����";
		mobile1.model = "������ 8";
		mobile1.color = "silver";
		mobile1.type = 5;
		
		Mobile mobile2 = new Mobile();
		mobile2.model = "S20";
		mobile2.color = "red";
		mobile2.type = 5;
		
		System.out.println(mobile1.company);
		System.out.println(mobile2.company);
//		������ ��ü�� �����Ǿ� �ֱ� ������ mobile1������
//		mobile1.company�� ���÷� �������־ ������ ���,
//		mobile2������ company�� �������� �ʾұ� ������
//		Ŭ�������� ������ �Ｚ�� ��µ�
		
		//��� �ʵ带 �Ű������� �ϴ� �����ڸ� �̿��� ��ü ����
		Mobile mobile4 = new Mobile("�Ｚ","��Ʈ10","black",5);
		System.out.println(mobile4.color);
		System.out.println(mobile4.company);
		System.out.println(mobile4.model);
		System.out.println(mobile4.type);
	}

}
