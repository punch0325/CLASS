package test200716_class3;

import java.util.Date;

public class Application {

// ��� ����� Ŭ����
	
	public void enter(Student stu) {
	 System.out.println("Applicaition Ŭ������ enter �޼ҵ�");
	 System.out.println(stu.name+"�� �ԽǿϷ�");
	 System.out.println("�Խǽð� : "+ new Date());
	}

	public void info(Student stu) {
		System.out.println(stu.name+"���� �����Դϴ�");
		System.out.println("�ּ� : "+stu.adress);
		System.out.println("��ȭ��ȣ : "+stu.phone);
	}

	public void info_1(Student stu) {
		System.out.println("������ Ȯ���ϼ���");
		System.out.println(stu.toString());
	}

	public void change(Student stu) {
		System.out.println("������ �����Ǿ����ϴ�");
		stu.adress = "����Ư����";
		System.out.println(stu.toString());
	}

	
}
